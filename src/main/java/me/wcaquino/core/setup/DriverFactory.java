package me.wcaquino.core.setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {

    protected static WebDriver driver;

    public static WebDriver getDriver(){

        if(driver == null) {
            switch (Propriedades.browser){
                case CHROME:
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions optionChrome = new ChromeOptions();
                    optionChrome.addArguments("--disable-notifications");
                    driver = new ChromeDriver(optionChrome);
                    break;
                case FIREFOX:
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions optionFireFox = new FirefoxOptions();
                    optionFireFox.addArguments("--disable-notifications");
                    driver = new FirefoxDriver(optionFireFox);
                    break;
                case EDGE:
                    WebDriverManager.edgedriver().setup();
                    EdgeOptions optionEdge = new EdgeOptions();
                    driver = new EdgeDriver(optionEdge);
                    break;
                case HEADLESS:
                    ChromeOptions optionHEADLESS = new ChromeOptions();
                    optionHEADLESS.addArguments("-disable-notifications");
                    driver = new ChromeDriver(optionHEADLESS);
                    break;
            }
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void killDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
}
