package Homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework_01_LoginPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        String[][] usernamesAndPasswords ={{"fiyodor","qwert"},
                                            {"Tester","qwert"},
                                            {"fiyodor","test"},
                                            {"Tester","test"}};

        for(int i = 0; i < usernamesAndPasswords.length; i++) {
            testLoginPage(webDriver, usernamesAndPasswords[i][0], usernamesAndPasswords[i][1]);
        }
        webDriver.quit();
    }
    public static void testLoginPage(WebDriver webDriver, String userName, String password) throws InterruptedException {
        webDriver.manage().window().maximize();
        webDriver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx");
        webDriver.findElement(By.id("ctl00_MainContent_username")).sendKeys(userName);
        Thread.sleep(2000);
        webDriver.findElement(By.name("ctl00$MainContent$password")).sendKeys(password);
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("//*[@id='ctl00_MainContent_login_button']")).click();
        Thread.sleep(2000);

    }
}
