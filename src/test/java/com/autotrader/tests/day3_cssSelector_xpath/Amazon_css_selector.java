package com.autotrader.tests.day3_cssSelector_xpath;

import com.autotrader.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Amazon_css_selector {
    public static void main(String[] args) {

        //TC #3: Amazon link number verification
        //1. Open Chrome browser
        //2. Go to https://www.amazon.com
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");

        //3. Enter search term (use cssSelector to locate search box)
        //Locating a web element using the first syntax in cssSelector

        /*
            ==> locate link using cssSelector
            a[href='https://www.tesla.com']

            tagName[attribute='value']

            1) input[id='twotabsearchtextbox']

            2) tagName#idValue --> # stands for id attribute in css selector
         */
        // WebElement searchBox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));

        WebElement searchBox = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox'"));
        searchBox.sendKeys("apple watch"+ Keys.ENTER);

        //tagName#idValue --> # stands for id attribute in css selector


    }
}
