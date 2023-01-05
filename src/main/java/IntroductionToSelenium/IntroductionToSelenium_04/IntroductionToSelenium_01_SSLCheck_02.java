package IntroductionToSelenium.IntroductionToSelenium_04;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class IntroductionToSelenium_01_SSLCheck_02 {
    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();

        //chromeOptions.addExtensions() adds an extension

        /*Proxy proxy = new Proxy();
        proxy.setHttpProxy("ipaddress:4444");
        chromeOptions.setCapability("proxy", proxy);*/

        /*Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", "/directory/path");
        chromeOptions.setExperimentalOption("prefs", prefs);*/

        chromeOptions.setAcceptInsecureCerts(true);
        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.get("https://expired.badssl.com/");
        System.out.println(webDriver.getTitle());

    }
}
