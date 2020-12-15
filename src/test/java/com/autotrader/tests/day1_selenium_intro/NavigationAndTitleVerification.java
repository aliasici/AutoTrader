package com.autotrader.tests.day1_selenium_intro;

import com.autotrader.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationAndTitleVerification {
    public static void main(String[] args) {
        //TC #3: Back and forth navigation1-
        //Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

//
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();

        //open browser
        // 2-Go to: https://google.com
        driver.get("https://www.google.com");

        // 3-Click to Gmail from top right

        // we are locating the Gmail web element using findElement method and linkText LOCATOR
        driver.findElement(By.linkText("Gmail")).click();

        // 4-Verify title contains:
        // Expected: Gmail

        String expectedInTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedInTitle)) {
            System.out.println("Title is verificated and test Passed");
        }else{
            System.out.println("Title verification Failed!");
        }
        // 5-Go back to Google by using the .back();
        driver.navigate().back();
        // 6-Verify title equals:
        // Expected: Google

        String expectedGoogleTitle = "Google";
        String actualGoogleTitle = driver.getTitle();

        if(actualGoogleTitle.equals(expectedGoogleTitle)){
            System.out.println("Google Title verification Passed!");

        }else{
            System.out.println("Google Title verification Failed");
        }


    }
}
