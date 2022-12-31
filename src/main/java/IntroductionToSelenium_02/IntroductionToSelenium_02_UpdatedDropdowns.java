package IntroductionToSelenium_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroductionToSelenium_02_UpdatedDropdowns {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        webDriver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(3000);
        System.out.println(webDriver.findElement(By.id("divpaxinfo")).getText());
        int i = 1;
        while (i < 5){
            webDriver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }
        webDriver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(webDriver.findElement(By.id("divpaxinfo")).getText());


    }
}
