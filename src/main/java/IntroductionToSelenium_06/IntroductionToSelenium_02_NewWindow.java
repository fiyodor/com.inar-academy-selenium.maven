package IntroductionToSelenium_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class IntroductionToSelenium_02_NewWindow {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://rahulshettyacademy.com/angularpractice/");
        webDriver.switchTo().newWindow(WindowType.TAB);
        //driver still controls 1st url
        Set<String> windowHandles = webDriver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        String parentWindowId = iterator.next();
        String childWindowId = iterator.next();
        webDriver.switchTo().window(childWindowId);
        webDriver.get("https://rahulshettyacademy.com");
        String courseName = webDriver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
        webDriver.close();
        webDriver.switchTo().window(parentWindowId);
        webDriver.findElement(By.cssSelector("[name='name']")).sendKeys(courseName);
    }
}
