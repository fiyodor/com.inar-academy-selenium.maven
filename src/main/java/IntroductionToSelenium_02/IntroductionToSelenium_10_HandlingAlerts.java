package IntroductionToSelenium_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroductionToSelenium_10_HandlingAlerts {
    public static void main(String[] args) throws InterruptedException {
        String text = "Ertuğrul DÖNMEZ";
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://rahulshettyacademy.com/AutomationPractice/");
        webDriver.findElement(By.id("name")).sendKeys(text);
        webDriver.findElement(By.id("alertbtn")).click();
        String[] alertText = webDriver.switchTo().alert().getText().split(",");
        alertText = alertText[0].split(" ");
        for(int i = 1; i < alertText.length; i++) {
            System.out.print(alertText[i] + " ");
        }
        Thread.sleep(2000);
        webDriver.switchTo().alert().accept();
        webDriver.findElement(By.id("name")).sendKeys(text);
        webDriver.findElement(By.id("confirmbtn")).click();
        webDriver.switchTo().alert().dismiss();
    }
}
