package Homeworks.SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TC_006 {
    public static void main(String[] args) {
        //This test checks whether the products are in right order or not when "Name (Z to A)" box is selected.

        //Set-up
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();


        //Navigate to url and login
        driver.get("https://www.saucedemo.com/");


        WebElement userNameBox = driver.findElement(By.id("user-name"));
        WebElement passwordBox = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        userNameBox.sendKeys("standard_user");
        passwordBox.sendKeys("secret_sauce");
        loginButton.click();

        //Select the "Name (Z to A)" box
        WebElement selectBox = driver.findElement(By.cssSelector("select.product_sort_container"));
        Select select = new Select(selectBox);
        select.selectByVisibleText("Name (Z to A)");

        //Collect product names in "ProductNames list"
        List<WebElement> productList = driver.findElements(By.id("//div[@class='inventory_item_name']"));
        ArrayList<String> productNames = new ArrayList<>();
        for (WebElement element: productList) {
            productNames.add(element.getText());
        }

        //Create a copy of the "productNames" list , sort the list in alphabetical order and reverse it.
        ArrayList<String> sortedProductNameList = new ArrayList<>();
        Collections.copy(sortedProductNameList , productNames);
        Collections.sort(sortedProductNameList);
        Collections.reverse(sortedProductNameList);

        //Check if sorted list and original list are in the same order, if they are then products are in the right order on the website.
        boolean bool = true;
        for (int i = 0; i < productNames.size() ;i++) {
            if (!productNames.get(i).equals(sortedProductNameList.get(i))) {
                System.out.println("Products are not in right order!");
                bool = false;
                break;
            }
        }
        Assert.assertTrue(bool);
        System.out.println("Test passed");

        //Quit the browser
        driver.quit();
    }
}