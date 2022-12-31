package Homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Homework_03_Order {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        String userName = "Tester";
        String password = "test";

        Homework_01_LoginPage.testLoginPage(driver, userName, password);
        driver.findElement(By.xpath("//*[@id=\"ctl00_menu\"]/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_ddlProduct\"]/option[3]")).click();
        actions.doubleClick(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]"))).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]")).sendKeys("30");
        actions.doubleClick(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtUnitPrice\"]"))).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtUnitPrice\"]")).sendKeys("50");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder\"]/tbody/tr/td/ol[1]/li[5]/input[2]")).click();
        Thread.sleep(1000);
        //Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtTotal\"]")).getText(), "540");

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("fiyodor");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox2\"]")).sendKeys("Emin Ongan");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox3\"]")).sendKeys("Istanbul");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("Turkey");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("34000");


        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_cardList\"]/tbody/tr/td[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox6\"]")).sendKeys("12341234123412");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox1\"]")).sendKeys("12/24");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_InsertButton\"]")).click();
        Thread.sleep(3000);

        //---------------------------------------------------------------------------------------------

        Homework_01_LoginPage.testLoginPage(driver, userName, password);
        driver.findElement(By.xpath("//*[@id=\"ctl00_menu\"]/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_ddlProduct\"]/option[3]")).click();
        actions.doubleClick(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]"))).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]")).sendKeys("30");
        actions.doubleClick(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtUnitPrice\"]"))).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtUnitPrice\"]")).sendKeys("50");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder\"]/tbody/tr/td/ol[1]/li[5]/input[2]")).click();
        Thread.sleep(1000);
        //Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtTotal\"]")).getText(), "540");

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("fiyodor");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox2\"]")).sendKeys("Emin Ongan");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox3\"]")).sendKeys("Istanbul");
        //driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("Turkey");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("34000");


        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_cardList\"]/tbody/tr/td[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox6\"]")).sendKeys("12341234123412");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox1\"]")).sendKeys("12/24");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_InsertButton\"]")).click();
        Thread.sleep(3000);


        //-------------------------------------------------------------------------------------------

        Homework_01_LoginPage.testLoginPage(driver, userName, password);
        driver.findElement(By.xpath("//*[@id=\"ctl00_menu\"]/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_ddlProduct\"]/option[2]")).click();
        actions.doubleClick(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]"))).perform();
        Thread.sleep(1000);
       // driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]")).sendKeys("30");
        actions.doubleClick(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtUnitPrice\"]"))).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtUnitPrice\"]")).sendKeys("50");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder\"]/tbody/tr/td/ol[1]/li[5]/input[2]")).click();
        Thread.sleep(1000);
        // Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtTotal\"]")).getText(), "540");


        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("fiyodor");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox2\"]")).sendKeys("Emin Ongan");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox3\"]")).sendKeys("Istanbul");
        // driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("Turkey");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("34000");


        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_cardList\"]/tbody/tr/td[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox6\"]")).sendKeys("12341234123412");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox1\"]")).sendKeys("12/24");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_InsertButton\"]")).click();
        Thread.sleep(3000);

        //-------------------------------------------------------------------------------------------

        Homework_01_LoginPage.testLoginPage(driver, userName, password);
        driver.findElement(By.xpath("//*[@id=\"ctl00_menu\"]/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_ddlProduct\"]/option[3]")).click();
        actions.doubleClick(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]"))).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]")).sendKeys("30");
        actions.doubleClick(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtUnitPrice\"]"))).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtUnitPrice\"]")).sendKeys("50");
        Thread.sleep(1000);
        // Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtTotal\"]")).getText(), "540");


        //driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("fiyodor");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox2\"]")).sendKeys("Emin Ongan");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox3\"]")).sendKeys("Istanbul");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("Turkey");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("34000");


        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_cardList\"]/tbody/tr/td[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox6\"]")).sendKeys("12341234123412");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox1\"]")).sendKeys("12/24");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_InsertButton\"]")).click();
        Thread.sleep(3000);

        //-------------------------------------------------------------------

        Homework_01_LoginPage.testLoginPage(driver, userName, password);
        driver.findElement(By.xpath("//*[@id=\"ctl00_menu\"]/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_ddlProduct\"]/option[3]")).click();
        actions.doubleClick(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]"))).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]")).sendKeys("30");
        actions.doubleClick(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtUnitPrice\"]"))).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtUnitPrice\"]")).sendKeys("50");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder\"]/tbody/tr/td/ol[1]/li[5]/input[2]")).click();
        Thread.sleep(1000);
        // Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtTotal\"]")).getText(), "540");


        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("fiyodor");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox2\"]")).sendKeys("Emin Ongan");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox3\"]")).sendKeys("Istanbul");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("Turkey");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("34000");


        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_cardList\"]/tbody/tr/td[2]")).click();
        //driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox6\"]")).sendKeys("12341234123412");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox1\"]")).sendKeys("12/24");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_InsertButton\"]")).click();
        Thread.sleep(3000);

        //------------------------------------------------------------------------

        Homework_01_LoginPage.testLoginPage(driver, userName, password);
        driver.findElement(By.xpath("//*[@id=\"ctl00_menu\"]/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_ddlProduct\"]/option[3]")).click();
        actions.doubleClick(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]"))).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]")).sendKeys("30");
        actions.doubleClick(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtUnitPrice\"]"))).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtUnitPrice\"]")).sendKeys("50");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder\"]/tbody/tr/td/ol[1]/li[5]/input[2]")).click();
        Thread.sleep(1000);
        // Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtTotal\"]")).getText(), "540");


        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("fiyodor");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox2\"]")).sendKeys("Emin Ongan");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox3\"]")).sendKeys("Istanbul");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("Turkey");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("34000");


        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_cardList\"]/tbody/tr/td[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox6\"]")).sendKeys("abcdefghijklm");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox1\"]")).sendKeys("1224");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_InsertButton\"]")).click();
        Thread.sleep(3000);

        //------------------------------------------------------------------------

        Homework_01_LoginPage.testLoginPage(driver, userName, password);
        driver.findElement(By.xpath("//*[@id=\"ctl00_menu\"]/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_ddlProduct\"]/option[3]")).click();
        actions.doubleClick(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]"))).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]")).sendKeys("30");
        actions.doubleClick(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtUnitPrice\"]"))).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtUnitPrice\"]")).sendKeys("50");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder\"]/tbody/tr/td/ol[1]/li[5]/input[2]")).click();
        Thread.sleep(1000);
        // Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtTotal\"]")).getText(), "540");


        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("fiyodor");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox2\"]")).sendKeys("Emin Ongan");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox3\"]")).sendKeys("Istanbul");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("Turkey");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("34000");


        //driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_cardList\"]/tbody/tr/td[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox6\"]")).sendKeys("abcdefghijklm");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox1\"]")).sendKeys("1224");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_InsertButton\"]")).click();
        Thread.sleep(3000);
    }
}
