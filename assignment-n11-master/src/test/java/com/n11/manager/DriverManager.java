package com.n11.manager;

import com.n11.utils.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import static com.n11.utils.Constants.*;

public class DriverManager {
    public static WebDriverWait wait;
    public static JavascriptExecutor js;
    public static WebDriver driver;

    /**
     * This method will create a driver and return it
     *
     * @return WebDriver driver
     */
    public static WebDriver setDriver(String browser) throws MalformedURLException {
//SET BROWSER DRIVER FILE PATH
        //No need to set for Grid(RemoteWebDriver) and Bonigarcia. They don't need these settings
        //System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        //System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver");
        /////////////////////////////
//        ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);

        switch (browser) {
            case "grid-firefox": {
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("start-maximized");
                //v3 Grid
                //driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), firefoxOptions);
                //v4 Grid
                driver = new RemoteWebDriver(new URL("http://localhost:4444"), firefoxOptions);
                System.out.println("***** Selenium Grid Firefox *****");
                break;
            }
            case "grid-chrome": {
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("start-maximized");
                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions);
                System.out.println("***** Selenium Grid Chrome *****");
                break;
            }
            case "firefox": {
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("start-maximized");
                driver = new FirefoxDriver(firefoxOptions);
                System.out.println("***** Browser is firefox *****");
                break;
            }
            case "firefox-headless": {
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("start-maximized");
                firefoxOptions.addArguments("--headless");
                driver = new FirefoxDriver(firefoxOptions);
                System.out.println("***** Browser is firefox *****");
                break;
            }
            case "chrome": {
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("start-maximized");
                driver = new ChromeDriver(chromeOptions);
                System.out.println("***** Browser is chrome *****");
                break;
            }
            case "chrome-headless": {
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("start-maximized");
                chromeOptions.addArguments("--headless");
                driver = new ChromeDriver(chromeOptions);
                System.out.println("***** Browser is chrome-headless *****");
                break;
            }
            default: {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                System.out.println("***** Browser is chrome-bonigarcia *****");
                break;
            }
        }
        js = (JavascriptExecutor) driver;
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));


        PageInitializer.initialize();
        return driver;
    }

    public static WebDriver getDriver(){
        return driver;
    }

    /**
     * This method will quit the browser
     */
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
