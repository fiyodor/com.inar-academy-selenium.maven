package IntroductionToSelenium_03;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class IntroductionToSelenium_06_JavaScriptExecutor {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) webDriver;
        webDriver.get("https://rahulshettyacademy.com/AutomationPractice/");
        javascriptExecutor.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        javascriptExecutor.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
        List<WebElement> values = webDriver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        int sum = 0;
        for(int i = 0; i < values.size() ; i++) {
            System.out.print(values.get(i).getText() + " ");
            sum += Integer.parseInt(values.get(i).getText());
        }
        System.out.println(sum);
        int total = Integer.parseInt(webDriver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
        System.out.println(total);
        Assert.assertEquals(total, sum);
        System.out.println("passed");
    }
}