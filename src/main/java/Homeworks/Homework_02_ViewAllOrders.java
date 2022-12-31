package Homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework_02_ViewAllOrders {
    public static void main(String[] args) throws InterruptedException{
        WebDriver webDriver = new ChromeDriver();
        String userName = "Tester";
        String password = "test";

        Homework_01_LoginPage.testLoginPage(webDriver, userName, password);
        webDriver.findElement(By.id("ctl00_MainContent_orderGrid_ctl02_OrderSelector")).click();
        Thread.sleep(2000);

        Homework_01_LoginPage.testLoginPage(webDriver, userName, password);
        webDriver.findElement(By.id("ctl00_MainContent_orderGrid_ctl05_OrderSelector")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.id("ctl00_MainContent_orderGrid_ctl09_OrderSelector")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.id("ctl00_MainContent_orderGrid_ctl08_OrderSelector")).click();
        Thread.sleep(1000);

        Homework_01_LoginPage.testLoginPage(webDriver, userName, password);
        webDriver.findElement(By.xpath("//*[@id='ctl00_MainContent_btnCheckAll']")).click();
        Thread.sleep(2000);

        Homework_01_LoginPage.testLoginPage(webDriver, userName, password);
        webDriver.findElement(By.xpath("//*[@id='ctl00_MainContent_btnCheckAll']")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.id("ctl00_MainContent_btnUncheckAll")).click();
        Thread.sleep(2000);

        Homework_01_LoginPage.testLoginPage(webDriver, userName, password);
        webDriver.findElement(By.id("ctl00_MainContent_orderGrid_ctl05_OrderSelector")).click();
        webDriver.findElement(By.cssSelector("input.btnDeleteSelected")).click();
        Thread.sleep(2000);

        Homework_01_LoginPage.testLoginPage(webDriver, userName, password);
        webDriver.findElement(By.id("ctl00_MainContent_orderGrid_ctl05_OrderSelector")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.id("ctl00_MainContent_orderGrid_ctl09_OrderSelector")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.id("ctl00_MainContent_orderGrid_ctl08_OrderSelector")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.cssSelector("input.btnDeleteSelected")).click();
        Thread.sleep(2000);
        webDriver.close();
    }
}
