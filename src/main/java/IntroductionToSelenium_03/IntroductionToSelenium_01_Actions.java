package IntroductionToSelenium_03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class IntroductionToSelenium_01_Actions {
    public static void main(String[] args) {
        WebDriver webDriver = new FirefoxDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://www.amazon.com/");
        Actions actions = new Actions(webDriver);
        WebElement move = webDriver.findElement(By.cssSelector("a[id='nav-link-accountList']"));

        actions.moveToElement(webDriver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
        //Moves to a specific element
        actions.moveToElement(move).contextClick().build().perform();
    }
}
