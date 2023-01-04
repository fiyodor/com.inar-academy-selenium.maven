package IntroductionToSelenium_04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IntroductionToSelenium_01_SSLCheck {
    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();
        //FirefoxOptions firefoxOptions = new FirefoxOptions();
        chromeOptions.setAcceptInsecureCerts(true);
        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.get("https://expired.badssl.com/");
        System.out.println(webDriver.getTitle());

    }
}
