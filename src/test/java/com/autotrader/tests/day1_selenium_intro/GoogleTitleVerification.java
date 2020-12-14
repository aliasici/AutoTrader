package com.autotrader.tests.day1_selenium_intro;

import com.autotrader.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleTitleVerification {

    public static void main(String[] args) {

        //        TC#4:	Google	search
//        1-Open	a	chrome	browse
        // setup browser driver
        //WebDriverManager.chromedriver().setup();
        // create driver instance and open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

//        2-Go	to:	https://google.com
        driver.get("https://www.google.com");
//        3-Write “apple” in search	box
        // to be able to write anything in search box
        // I need to locate the search box and use sendKeys() method to send "apple"
        driver.findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);

//        4-Click	google	search	button
//        5-Verify	title:
//        Expected:	Title	should	start	with	“apple" word
        String expectedTitle = "apple - Google Search";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Search title verification PASSED!");
        }else{
            System.out.println("Search title verification FAILED!!!");
        }
        //
    }



}
