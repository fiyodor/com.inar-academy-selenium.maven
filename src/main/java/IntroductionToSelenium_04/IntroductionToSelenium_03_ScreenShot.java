package IntroductionToSelenium_04;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class IntroductionToSelenium_03_ScreenShot {
    public static void main(String[] args) throws IOException {

        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().deleteAllCookies();
        //webDriver.manage().deleteCookieNamed("qwert");
        //webDriver.manage().addCookie();
        webDriver.get("https://google.com/");
        System.out.println(webDriver.getTitle());
        File src = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\90543\\Desktop\\InarAcademy2022\\Selenium\\screenshot.png"));
    }
}
