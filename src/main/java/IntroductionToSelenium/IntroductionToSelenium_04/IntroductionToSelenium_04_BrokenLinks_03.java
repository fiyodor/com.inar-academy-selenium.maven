package IntroductionToSelenium.IntroductionToSelenium_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class IntroductionToSelenium_04_BrokenLinks_03 {
    public static void main(String[] args) throws IOException {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        List<WebElement> links = webDriver.findElements(By.cssSelector("li[class='gf-li'] a"));
        for(WebElement link : links){
            String url = link.getAttribute("href");
            HttpURLConnection connection = (HttpURLConnection)new URL(url).openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();
            int respCode = connection.getResponseCode();
            System.out.println(respCode);
            if(respCode > 400){
                System.out.println("The link with text " + link.getText() + " is broken with code " + respCode);
                Assert.assertTrue(false);
            }
        }
        //Broken URL

    }
}
