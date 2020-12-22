package com.autotrader.tests.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    /*
         DRIVER UTILITY CLASS
        - Driver util class
        - Why are we learning this?
        -We have too many lines to initialize the driver
        -We are not able to pass the same driver instance when calling methods from other classes

        SOLUTION: Creating a driver utility that guarantees a single instance of the driver and does the initial setup (maximize, imp)
        - It should be able to read values from configuration.properties dynamically

        What happens when you create a private constructor in java class?
        - Stops everyone being able to create object from that class.

        SINGLETON DESIGN PATTERN:
        #1- We make constructor private.
        #2- We create a getter method for the constructor so that it returns
        the object in the way that we want to share it.

     */

    private Driver(){}

    private static WebDriver driver;

    public static WebDriver getDriver(){

        if(driver == null){

            String browser = ConfigurationReader.getProperty("browser");
            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();

                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();

                    break;
            }
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;
    }

    public static void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver = null;
        }
    }


}
