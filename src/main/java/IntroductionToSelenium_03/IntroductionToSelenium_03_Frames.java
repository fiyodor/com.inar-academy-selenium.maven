package IntroductionToSelenium_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class IntroductionToSelenium_03_Frames {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://jqueryui.com/droppable/");
        System.out.println(webDriver.findElements(By.tagName("iframe")).size());
        //webDriver.switchTo().frame(webDriver.findElement(By.cssSelector("iframe.demo-frame")));
        webDriver.switchTo().frame(0);
        webDriver.findElement(By.id("draggable")).click();
        Actions actions = new Actions(webDriver);
        actions.dragAndDrop(webDriver.findElement(By.id("draggable")), webDriver.findElement(By.id("droppable"))).build().perform();
        webDriver.switchTo().defaultContent();

    }
}
