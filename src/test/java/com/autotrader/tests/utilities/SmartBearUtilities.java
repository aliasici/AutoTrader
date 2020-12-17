package com.autotrader.tests.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SmartBearUtilities {

    public static void loginToSmartBear(WebDriver driver){

        WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester");

        WebElement password = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));

        password.sendKeys("test");

        WebElement loginButton = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$login_button']"));

        loginButton.click();



    }
}
