package IntroductionToSelenium.IntroductionToSelenium_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class IntroductionToSelenium_05_Filter {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        webDriver.findElement(By.id("search-field")).sendKeys("Rice");
        List<WebElement> vegetables = webDriver.findElements(By.xpath("//tr/td[1]"));
        //5 results
        List<WebElement> filteredList = vegetables.stream().filter(s -> s.getText().contains("Rice")).collect(Collectors.toList());
        //1 result
        Assert.assertEquals(vegetables.size(), filteredList.size());
    }
}
