package IntroductionToSelenium.IntroductionToSelenium_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class IntroductionToSelenium_04_BrokenLinks_02 {
    public static void main(String[] args) throws IOException {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        //Broken URL
        String url = webDriver.findElement(By.cssSelector("a[href*='brokenlink\']")).getAttribute("href");
        HttpURLConnection connection = (HttpURLConnection)new URL(url).openConnection();
        connection.setRequestMethod("HEAD");
        connection.connect();
        int respCode = connection.getResponseCode();
        System.out.println(respCode);
    }
}
