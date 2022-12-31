package IntroductionToSelenium_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IntroductionToSelenium_03 {
    public static void main(String[] args) {

    WebDriver driver = new FirefoxDriver();
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\90543\\Desktop\\InarAcademy2022\\Selenium\\Drivers\\geckodriver.exe");
    // the upper code isn't necessary anymore
        driver.get("https://instagram.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();

}
}
