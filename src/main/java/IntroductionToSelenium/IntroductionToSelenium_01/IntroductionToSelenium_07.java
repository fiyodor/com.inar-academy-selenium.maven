package IntroductionToSelenium.IntroductionToSelenium_01;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class IntroductionToSelenium_07 {
    public static void main(String[] args) throws InterruptedException {
        String name = "rahul";
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://rahulshettyacademy.com/locatorspractice/");
        webDriver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
        webDriver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        webDriver.findElement(By.id("chkboxOne")).click();
        webDriver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        Thread.sleep(2000);
        System.out.println(webDriver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(webDriver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        Assert.assertEquals(webDriver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello " + name + ",");
        webDriver.findElement(By.xpath("//button[text()='Log Out']")).click();
        Thread.sleep(3000);
        webDriver.close();
    }
}
