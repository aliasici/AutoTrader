package com.autotrader.tests.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    /*
        UTILITIES:
        In "utilities" package we create new classes, and new methods for the reasons below:
        #1 -> to remove repetitive steps
        #2 -> to create a new logic
        #3 -> or to create a new logic AND to remove repetitive steps
        #4 -> to make our code easy to maintain.
     */


    public static WebDriver getDriver(String browserType){
        if(browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }else if(browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else{
            System.out.println("Given browser does not exist. Driver = null");
            return null;
        }


    }
}
