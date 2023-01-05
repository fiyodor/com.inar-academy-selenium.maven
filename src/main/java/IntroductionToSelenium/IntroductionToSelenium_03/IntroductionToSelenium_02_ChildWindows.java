package IntroductionToSelenium.IntroductionToSelenium_03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class IntroductionToSelenium_02_ChildWindows {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://rahulshettyacademy.com/loginpagePractise/");
        webDriver.findElement(By.cssSelector(".blinkingText")).click();
        Set<String> windows = webDriver.getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        String parentId = iterator.next();
        String childId = iterator.next();
        webDriver.switchTo().window(childId);
        System.out.println(webDriver.findElement(By.cssSelector(".im-para.red")).getText());
        String email = webDriver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
        webDriver.switchTo().window(parentId);
        webDriver.findElement(By.id("username")).sendKeys(email);
    }
}
