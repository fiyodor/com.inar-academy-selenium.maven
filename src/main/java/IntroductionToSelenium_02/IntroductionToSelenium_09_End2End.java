package IntroductionToSelenium_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class IntroductionToSelenium_09_End2End {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        webDriver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        webDriver.findElement(By.xpath("//a[@value='DEL']")).click();
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        webDriver.findElement(By.cssSelector(".ui-datepicker-days-cell-over.ui-datepicker-today")).click();
        if(webDriver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")){
            Assert.assertTrue(true);
        }
        else{

            Assert.assertTrue(false);
        }
        webDriver.findElement(By.id("divpaxinfo")).click();
        for(int i = 0; i < 4; i++) {
            webDriver.findElement(By.id("hrefIncAdt")).click();
        }
        Assert.assertEquals(webDriver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
        webDriver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
        webDriver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();






    }
}
