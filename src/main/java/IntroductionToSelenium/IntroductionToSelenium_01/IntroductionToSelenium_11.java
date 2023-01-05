package IntroductionToSelenium.IntroductionToSelenium_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroductionToSelenium_11 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.navigate().to("https://google.com");
        driver.navigate().back();
        driver.navigate().forward();


    }
}
