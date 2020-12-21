package com.autotrader.tests.smartbear;

import com.autotrader.tests.base.TestBase;
import com.autotrader.tests.utilities.BrowserUtils;
import com.autotrader.tests.utilities.SmartBearUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class Practice_9_10_11 extends TestBase {
    // Finally I moved all @BeforeMethod and @AfterMethod in TestBase


    @Test
    public void p9_delete_order_task() throws IOException {
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx

        //Creating properties object to be able to read properties file
        Properties properties = new Properties();

        //Opening the file in JVM memory using FileInputStream
        FileInputStream file = new FileInputStream("configuration.properties");

        //Loading the file into properties object
        properties.load(file);

        //URL is coming from configuration.properties
        String url = properties.getProperty("smartbearUrl");

       // driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.get(url);
        // I called the method from SmartBearUtilities
        SmartBearUtilities.loginToSmartBear(driver);

        BrowserUtils.wait(3);


        // WebElement markSmithCheckbox = driver.findElement(By.xpath("//td[.='Mark Smith']/preceding-sibling::td[1]"));
        //WebElement markSmithCheckbox = driver.findElement(By.xpath("//td[.='Mark Smith']/../td[1]"));

        WebElement markSmithCheckBox = driver.findElement(By.xpath("//td[.='Mark Smith']/../td[1]"));
        markSmithCheckBox.click();
        BrowserUtils.wait(3);

        WebElement deleteSelected = driver.findElement(By.id("ctl00_MainContent_btnDelete"));

        deleteSelected.click();
        BrowserUtils.wait(3);
        // SmartBearUtilities.verifyOrder(driver,"Mark Smith");

        List<WebElement> nameList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));

        for(WebElement each : nameList){
            Assert.assertFalse(each.getText().equals("Mark Smith"));
        }





    }


}
