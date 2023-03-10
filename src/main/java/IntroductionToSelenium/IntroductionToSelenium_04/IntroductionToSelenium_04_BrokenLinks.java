package IntroductionToSelenium.IntroductionToSelenium_04;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class IntroductionToSelenium_04_BrokenLinks {
    public static void main(String[] args) throws IOException {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        //Broken URL
        webDriver.findElement(By.cssSelector("a[href*='soapui\']")).getAttribute("href");
    }
}
