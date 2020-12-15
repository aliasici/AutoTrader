package com.autotrader.tests.day2_selenium_locators;

import com.autotrader.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class EtsyTitleVerification {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.etsy.com");
        driver.manage().window().maximize();

        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("wooden spoon"+ Keys.ENTER);

        String expectedResult  = "Wooden spoon | Etsy";
        String actualResult = driver.getTitle();

        if(actualResult.equals(expectedResult)){
            System.out.println("Search verification Passed!");
        }else {
            System.out.println("Search verification is Failed!!!");
        }


    }
}
