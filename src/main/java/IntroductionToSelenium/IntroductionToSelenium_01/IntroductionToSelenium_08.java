package IntroductionToSelenium.IntroductionToSelenium_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class IntroductionToSelenium_08 {
    public static void main(String[] args) throws InterruptedException {
        String name = "rahul";
        WebDriver webDriver = new ChromeDriver();
        String password = getPassword(webDriver);
        webDriver.get("https://rahulshettyacademy.com/locatorspractice/");
        webDriver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
        webDriver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password);
        webDriver.findElement(By.id("chkboxOne")).click();
        webDriver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        Thread.sleep(2000);
        System.out.println(webDriver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(webDriver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        Assert.assertEquals(webDriver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello " + name + ",");
        webDriver.findElement(By.xpath("//button[text()='Log Out']")).click();
        Thread.sleep(3000);
        webDriver.close();
    }
    public static String getPassword(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String passwordText = driver.findElement(By.cssSelector("form p")).getText();
        String [] passwordArray = passwordText.split("'");
        // 0th index -> Please use temporary password
        // 1st index -> rahulshettyacademy' to Login.
        // passwordArray[1].split("'");
        /// 0th index -> rahulshettyacademy
        // 1st index -> to Login.
        String password = passwordArray[1].split("'")[0];
        return password;
    }
}
