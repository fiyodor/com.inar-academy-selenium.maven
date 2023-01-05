package IntroductionToSelenium.IntroductionToSelenium_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class IntroductionToSelenium_14_FluentWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        webDriver.findElement(By.cssSelector("div[id='start'] button")).click();
        Wait wait = new FluentWait<WebDriver>(webDriver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

        WebElement foo = (WebElement) wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver webDriver) {
                if (webDriver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed()){
                    return webDriver.findElement(By.cssSelector("[id='finish'] h4"));
                }else
                    return null;
            }
        });
        System.out.println(webDriver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed());

        System.out.println(webDriver.findElement(By.xpath("//*[@id=\"finish\"]/h4")).getText());



    }
}
