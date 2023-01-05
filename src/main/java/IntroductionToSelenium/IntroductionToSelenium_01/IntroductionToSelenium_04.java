package IntroductionToSelenium.IntroductionToSelenium_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class IntroductionToSelenium_04 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://rahulshettyacademy.com/locatorspractice/");
        webDriver.findElement(By.id("inputUsername")).sendKeys("rahul");
        webDriver.findElement(By.name("inputPassword")).sendKeys("hello123");
        webDriver.findElement(By.className("signInBtn")).click();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println(webDriver.findElement(By.cssSelector("p.error")).getText());
        webDriver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(3000);
        webDriver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("fiyodor");
        webDriver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("fiyodor@fiyodor.com");
        webDriver.findElement(By.xpath("//input[@placeholder='Name']")).clear();
        webDriver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        webDriver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("fiyodor@ertugrul.com");
        webDriver.findElement(By.xpath("//form/input[3]")).sendKeys("5555555555");
        Thread.sleep(3000);
        webDriver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(webDriver.findElement(By.cssSelector("form p")).getText());

        //webDriver.close();
    }
}
