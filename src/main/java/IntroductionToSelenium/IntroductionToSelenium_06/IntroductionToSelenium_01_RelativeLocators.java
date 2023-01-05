package IntroductionToSelenium.IntroductionToSelenium_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class IntroductionToSelenium_01_RelativeLocators {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://rahulshettyacademy.com/angularpractice/");

        //above
        WebElement nameEditBox = webDriver.findElement(By.cssSelector("[name='name']"));
        System.out.println(webDriver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());

        //below
        WebElement dateOfBirth = webDriver.findElement(By.cssSelector("[for='dateofBirth']"));
        webDriver.findElement(with(By.tagName("input")).below(dateOfBirth)).click();

        //left
        WebElement iceCreamlabel = webDriver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
        webDriver.findElement(with(By.tagName("input")).toLeftOf(iceCreamlabel)).click();

        //right
        WebElement rdb = webDriver.findElement(By.id("inlineRadio1"));
        System.out.println(webDriver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());
    }
}
