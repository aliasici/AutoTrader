package com.autotrader.tests.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartBearUtilities {

    public static void loginToSmartBear(WebDriver driver){

        WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester");

        WebElement password = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));

        password.sendKeys("test");

        WebElement loginButton = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$login_button']"));

        loginButton.click();

    }

    /*
   @Param: Method takes WebDriver object and String(name).
   • Method should verify if given name exists in orders.
   • This method should simply accepts a name(String), and assert whether
   given name is in the list or not.
   • Create a new TestNG test to test if the method is working as expected.
    */
    public static void verifyOrder(WebDriver driver, String name){

        //Created a locator that only returns the names of the costumer from all of the rows
        //Created a list and stored the cells that has costumer name information into it.
        List<WebElement> namesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));

        //If there is only one table on the page, you dont have to locate the table. --> //tr/td[2]
        //List<WebElement> namesList = driver.findElements(By.xpath("//tr/td[2]"));


        //type iter, press tab for "for each" loop short cut.

        for (WebElement each : namesList) {

            if (each.getText().equals(name)){
                Assert.assertTrue(each.getText().equals(name));
                return;
            }
        }
        // Assert fail method will fail the test when it is called, no matter what.
        Assert.fail("Name: "+name+" does not exist in the list! Verification FAILED!!!");

    }
}
