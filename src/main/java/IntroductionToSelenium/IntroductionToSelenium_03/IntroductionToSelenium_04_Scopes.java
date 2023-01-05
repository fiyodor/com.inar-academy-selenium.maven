package IntroductionToSelenium.IntroductionToSelenium_03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class IntroductionToSelenium_04_Scopes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("http://www.qaclickacademy.com/");
        webDriver.findElement(By.xpath("//a[normalize-space()='Practice']")).click();
        //1. Give me the count of links on the page. with (a)
        System.out.println("All the links: " + webDriver.findElements(By.tagName("a")).size());
        WebElement footerDriver = webDriver.findElement(By.id("gf-BIG"));   //limiting webdirver scope
        System.out.println("Links in the footer: " + footerDriver.findElements(By.tagName("a")).size());
        WebElement columnDriver = footerDriver.findElement(By.xpath("//tbody/tr/td[1]/ul[1]"));
        System.out.println("Links in the 1st column: " + columnDriver.findElements(By.tagName("a")).size());
        //click on each link in the particular column and check if the links are working or not
        for(int i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++) {
            String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
            columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
            Thread.sleep(5000L);
        }
        Set<String> urlTitles = webDriver.getWindowHandles();
        Iterator<String> iterator = urlTitles.iterator();
        while (iterator.hasNext()){
            webDriver.switchTo().window(iterator.next());
            System.out.println(webDriver.getTitle());
        }
    }
}
