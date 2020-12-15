package com.autotrader.tests.day1_selenium_intro;

import com.autotrader.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearch {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("apple watch" + Keys.ENTER);

        String expectedTitle = "apple watch - Google";
        String actualTitle = driver.getTitle();

        // we can use either equals and contains. prefer that equals for single word like apple

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Search title verification Passed");
        }else{
            System.out.println("Search title verification Failed!!!");
        }



    }
}
