package IntroductionToSelenium_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Arrays;
import java.util.List;

public class IntroductionToSelenium_11_Base {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://rahulshettyacademy.com/seleniumPractise/");
        Thread.sleep(3000);
        String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot"};
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
