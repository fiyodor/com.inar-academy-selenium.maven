package IntroductionToSelenium_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class IntroductionToSelenium_04_AutoSuggestiveDropdowns {
    public static void main(String[] args) {
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        webDriver.findElement(By.id("autosuggest")).sendKeys("ind");
        List<WebElement> options = webDriver.findElements(By.cssSelector("li[class='ui-menu-item']"));
        for(WebElement option: options) {
            if(option.getText().equalsIgnoreCase("india")){
                option.click();
                break;
            }
        }

    }
}
