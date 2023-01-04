package IntroductionToSelenium_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class IntroductionToSelenium_04_GetPrice_Rice {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        //click on column
        webDriver.findElement(By.xpath("//tr/th[1]")).click();
        //webDriver.findElement(By.xpath("//tr/th[1]")).click();    //for error click again
        //capture all web elements into list
        List<WebElement> elementsList = webDriver.findElements(By.xpath("//tr/td[1]"));
        //capture text of all web elements into a new list --> original list
        List<String> originalList = elementsList.stream().map(s -> s.getText()).collect(Collectors.toList());
        //sort the list --> sorted list
        List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
        //compare original vs sorted
        Assert.assertTrue(originalList.equals(sortedList));

        List<String> price;
        //scan the name column with getText -> Rice -> print price
        do {
            List<WebElement> rows = webDriver.findElements(By.xpath("//tr/td[1]"));
            price = rows.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPrice(s)).collect(Collectors.toList());
            price.forEach(a -> System.out.println(a));
            if(price.size() < 1){
                webDriver.findElement(By.cssSelector("[aria-label='Next']")).click();
            }
        }while (price.size() < 1);

    }

    private static String getPrice(WebElement s) {
        String price = s.findElement(By.xpath("following-sibling::td[1]")).getText();
        return price;
    }

}
