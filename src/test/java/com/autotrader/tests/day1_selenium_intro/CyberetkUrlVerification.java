package com.autotrader.tests.day1_selenium_intro;

import com.autotrader.tests.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CyberetkUrlVerification {
    public static void main(String[] args) {


        //TC #2: Cybertek verifications
        //1. Open Chrome browser
        // I need to use WebDriverFactory
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // this line is will maximize the newly opened browser page

        driver.manage().window().maximize();
        //2. Go to https://practice.cybertekschool.com
        driver.get("http://practice.cybertekschool.com");

        //3. Verify URL contains
        //Expected: cybertekschool

        driver.manage().window().maximize();

        String expectedResult = "cybertekschool";
        String actualResult = driver.getCurrentUrl();

        if(actualResult.contains(expectedResult)){
            System.out.println("URL verification PASSED!");
        }else{
            System.out.println("URL verification FAILED!!!!");
        }

        if(driver.getTitle().equals("Practice")){
            System.out.println("It is Correct");
        }else{
            System.out.println("Title verification is Failed!!!");
        }
    }
}
