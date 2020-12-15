package com.autotrader.tests.day3_cssSelector_xpath;

import com.autotrader.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZeroBankVerification {
    public static void main(String[] args) {


//        TC #2: Zero Bank link text verification
//        1. Open Chrome browser

          WebDriver driver = WebDriverFactory.getDriver("chrome");

//        2. Go to http://zero.webappsecurity.com/login.html

          driver.get("http://zero.webappsecurity.com/login.html");


//        3. Verify link text from top left:
//        Expected: “Zero Bank”
          WebElement verifyText = driver.findElement(By.className("brand"));

          String actualText = verifyText.getText();
          String expectedText = "Zero Bank";

          if(actualText.equals(expectedText)){
              System.out.println("Link text verification PASSED!");
          }else{
              System.out.println("Link text verification FAILED!!!");
          }
        //        4. Verify link href attribute value contains:
           //  Expected: “index.html”

        String expectedInHref = "index.html";
        String actualHrefValue = verifyText.getAttribute("href");

        System.out.println("expectedInHref= "+expectedInHref);
        System.out.println("actualHrefValue= "+actualHrefValue);

        if(actualHrefValue.contains(expectedInHref)){
            System.out.println("Href value verification PASSED!");
        }else{
            System.out.println("Href value verification FAILED!!!");
        }




    }

}
