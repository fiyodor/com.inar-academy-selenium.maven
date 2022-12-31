package IntroductionToSelenium_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IntroductionToSelenium_01 {

    public static void main(String[] args) {

        //Invoking Browser
        //WebDriver is an interface
        //Chrome - ChromeDriver -> WebDriver Methods + Chrome Methods ->  close, get
        //Firefox - FirefoxDriver -> WebDriver Methods + Firefox Methods ->  close, get
        //Safari - safariDriver -> WebDriver Methods + Safari Methods -> close, get
        //If we use driver classes seperately, this would might not be working in other drivers because it might have class methods that the other classes have!

        WebDriver webDriver = new ChromeDriver();

        //webdriver.chrome.driver -> value of path ( we must write)
        System.setProperty("webdriver.chrome.drive", "C:\\Users\\90543\\Desktop\\InarAcademy2022\\Selenium\\Drivers\\chromedriver.exe");

        WebDriver firefoxDriver = new FirefoxDriver();

        System.setProperty("webdriver.firefox.drive", "C:\\Users\\90543\\Desktop\\InarAcademy2022\\Selenium\\Drivers\\firefoxdriver.exe");

    }
}
