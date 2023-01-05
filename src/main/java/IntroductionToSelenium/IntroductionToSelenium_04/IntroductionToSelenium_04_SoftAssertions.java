package IntroductionToSelenium.IntroductionToSelenium_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class IntroductionToSelenium_04_SoftAssertions {
    public static void main(String[] args) throws IOException {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        List<WebElement> links = webDriver.findElements(By.cssSelector("li[class='gf-li'] a"));
        SoftAssert softAssert = new SoftAssert();
        for(WebElement link : links){
            String url = link.getAttribute("href");
            HttpURLConnection connection = (HttpURLConnection)new URL(url).openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();
            int respCode = connection.getResponseCode();
            System.out.println(respCode);
            softAssert.assertTrue(respCode < 400, "The link with text " + link.getText() + " is broken with code " + respCode);
        }
        softAssert.assertAll();
    }
}
