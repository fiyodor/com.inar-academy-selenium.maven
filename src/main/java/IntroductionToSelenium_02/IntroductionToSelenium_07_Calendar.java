package IntroductionToSelenium_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class IntroductionToSelenium_07_Calendar {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //URL in the browser
        //a[@value='MAA'] - xpath fpr chennai
        //a[@value='BLR'] - xpath for bengaluru
        webDriver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        webDriver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);
        //webDriver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        webDriver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        // //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA'] --> Parent-Child relationship locator to Identify the objects Uniquely
        webDriver.findElement(By.cssSelector(".ui-datepicker-days-cell-over.ui-datepicker-today")).click();
    }
}
