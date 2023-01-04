package IntroductionToSelenium_06;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class IntroductionToSelenium_04_CapturingHeightAndWidth {
    public static void main(String[] args) throws IOException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://rahulshettyacademy.com/angularpractice/");

        //switching window
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

        //Screenshot
        WebElement name = webDriver.findElement(By.cssSelector("[name='name']"));
        File file = name.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("logo.png"));

        //get height and width
        System.out.println(name.getRect().getDimension().getHeight());
        System.out.println(name.getRect().getDimension().getWidth());


    }
}
