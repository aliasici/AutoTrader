package com.autotrader.tests.day2_selenium_locators;

import com.autotrader.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderVerification {
    public static void main(String[] args) {
       // TC #6: Zero Bankheader verification
       //  1.Open Chrome browser

        // open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
       //  2.Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

//        3.Verify header text
//        Expected: “Log in to ZeroBank
        // WebElement header = driver.findElement(By.tagName("h3")); // find element returns webElement

      //  driver.findElement(By.tagName("h3")).getText();


        String actualText = driver.findElement(By.tagName("h3")).getText(); // - return type is String.

       // above  it returns the text of the web element as a String.
        String expectedResult = "Log in to ZeroBank";
        if(actualText.equals(expectedResult)){
            System.out.println("Header verification PASSED!");
        }else{
            System.out.println("Header verification FAILED!!!");
        }




    }
}
