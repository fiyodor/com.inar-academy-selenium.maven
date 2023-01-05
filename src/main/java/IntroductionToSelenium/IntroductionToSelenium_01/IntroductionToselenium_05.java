package IntroductionToSelenium.IntroductionToSelenium_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroductionToselenium_05 {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://rahulshettyacademy.com/locatorspractice/");
        webDriver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
        webDriver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        webDriver.findElement(By.id("chkboxOne")).click();
        webDriver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
    }
}
