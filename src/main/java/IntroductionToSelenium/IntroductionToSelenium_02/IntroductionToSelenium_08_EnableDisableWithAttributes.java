package IntroductionToSelenium.IntroductionToSelenium_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class IntroductionToSelenium_08_EnableDisableWithAttributes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //System.out.println(webDriver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        Assert.assertFalse(webDriver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        webDriver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        //System.out.println(webDriver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        Assert.assertTrue(webDriver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        //isEnabled not working
        /* System.out.println(webDriver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
        webDriver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(webDriver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());*/
        System.out.println(webDriver.findElement(By.id("Div1")).getAttribute("style"));
        webDriver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(webDriver.findElement(By.id("Div1")).getAttribute("style"));
        if(webDriver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
            System.out.println("Enabled");
            Assert.assertTrue(true);
        }
        else{
            System.out.println("Disabled");
            Assert.assertTrue(false);
        }
    }
}
