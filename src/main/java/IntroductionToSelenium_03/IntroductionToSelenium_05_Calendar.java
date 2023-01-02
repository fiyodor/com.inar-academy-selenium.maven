package IntroductionToSelenium_03;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class IntroductionToSelenium_05_Calendar {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        webDriver.manage().window().maximize();
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) webDriver;
        webDriver.get("https://www.path2usa.com/travel-companion/");
        javascriptExecutor.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(1000);
        webDriver.findElement(By.id("form-field-travel_comp_date")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.id("form-field-travel_comp_date")).click();
        System.out.println(webDriver.findElement(By.cssSelector("span[title='Scroll to increment']")).getText());
        //December 21
        while (!webDriver.findElement(By.cssSelector("[class='flatpickr-current-month'] [class='cur-month']")).getText().contains("December")) {
            webDriver.findElement(By.cssSelector("[class='flatpickr-next-month']")).click();
        }
        Thread.sleep(2000);
        List<WebElement> dates = webDriver.findElements(By.xpath("//span[@class='flatpickr-day ']"));
        System.out.println(dates.size());
        for(int i = 0; i < dates.size(); i++) {
            WebElement element = dates.get(i);
            String str = element.getText();
            str.trim();
            if(str.equalsIgnoreCase("21")) {
                element.click();
            }
        }
    }
}
