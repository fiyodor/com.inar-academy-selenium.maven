package IntroductionToSelenium.IntroductionToSelenium_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class IntroductionToSelenium_06_Assertion {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //System.out.println(webDriver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        Assert.assertFalse(webDriver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        webDriver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        //System.out.println(webDriver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        Assert.assertTrue(webDriver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        //count the number of the checkboxes
        System.out.println(webDriver.findElements(By.cssSelector("input[type='checkbox']")).size());
        webDriver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(3000);
        System.out.println(webDriver.findElement(By.id("divpaxinfo")).getText());
        int i = 1;
        while (i < 5){
            webDriver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }
        webDriver.findElement(By.id("btnclosepaxoption")).click();
        //System.out.println(webDriver.findElement(By.id("divpaxinfo")).getText());
        Assert.assertEquals(webDriver.findElement(By.id("divpaxinfo")).getText(), "4 Adults");
    }
}
