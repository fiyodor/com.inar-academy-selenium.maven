package IntroductionToSelenium_04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroductionToSelenium_02_Miscellaneous {
    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().deleteAllCookies();
        //webDriver.manage().deleteCookieNamed("qwert");
        //webDriver.manage().addCookie();
        webDriver.get("https://google.com/");
        System.out.println(webDriver.getTitle());

    }
}
