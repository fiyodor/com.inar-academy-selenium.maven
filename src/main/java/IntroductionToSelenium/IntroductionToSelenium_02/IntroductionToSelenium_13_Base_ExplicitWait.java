package IntroductionToSelenium.IntroductionToSelenium_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class IntroductionToSelenium_13_Base_ExplicitWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new FirefoxDriver();
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        webDriver.get("https://rahulshettyacademy.com/seleniumPractise/");
        Thread.sleep(3000);
        String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot"};
        addItems(webDriver, itemsNeeded);
        webDriver.findElement(By.cssSelector("img[alt='Cart']")).click();
        webDriver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
        webDriver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        webDriver.findElement(By.cssSelector("button.promoBtn")).click();

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
        System.out.println(webDriver.findElement(By.cssSelector("span.promoInfo")).getText());
    }
    public static void addItems(WebDriver webDriver, String[] itemsNeeded){
        List<WebElement> products = webDriver.findElements(By.cssSelector("h4.product-name"));
        int addCounter = 0;

        for(int i = 0; i < products.size(); i++) {
            String[] name = products.get(i).getText().split("-");
            String formattedName = name[0].trim();
            List itemsNeededList = Arrays.asList(itemsNeeded);
            if(itemsNeededList.contains(formattedName)){
                webDriver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                addCounter++;
                if(addCounter == itemsNeeded.length){
                    break;
                }
            }
        }
    }
}
