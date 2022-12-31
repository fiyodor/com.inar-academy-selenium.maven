package IntroductionToSelenium_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroductionToSelenium_02 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        // System.setProperty("webdriver.chrome.driver", "C:\\Users\\90543\\Desktop\\InarAcademy2022\\Selenium\\Drivers\\chromedriver.exe");
        // the upper code isn't necessary anymore
        driver.get("https://instagram.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();

    }
}
