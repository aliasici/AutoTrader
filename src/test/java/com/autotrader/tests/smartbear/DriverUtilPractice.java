package com.autotrader.tests.smartbear;

import com.autotrader.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DriverUtilPractice {

    @Test
    public void simple_google_search(){

        Driver.getDriver().get("https://www.google.com");

        WebElement searchbox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));

        searchbox.sendKeys("apple watch"+ Keys.ENTER);

        String expectedTitle = "apple watch";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));


    }


}
