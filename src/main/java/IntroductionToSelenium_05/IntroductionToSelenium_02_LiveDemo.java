package IntroductionToSelenium_05;

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

public class IntroductionToSelenium_02_LiveDemo {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        //click on column
        webDriver.findElement(By.xpath("//tr/th[1]")).click();
        //webDriver.findElement(By.xpath("//tr/th[1]")).click();    //for error click again
        //capture all web elements into list
        List<WebElement> elementsList = webDriver.findElements(By.xpath("//tr/td[1]"));
        //capture text of all web elements into a new list --> original list
        List<String> originalList = elementsList.stream().map(s -> s.getText()).collect(Collectors.toList());
        //sort the list --> sorted list
        List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
        //compare original vs sorted
        Assert.assertTrue(originalList.equals(sortedList));
    }
}
