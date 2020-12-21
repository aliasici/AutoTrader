package com.autotrader.tests.dropdowns_alerts_iframes;

import com.autotrader.tests.utilities.SmartBearUtilities;
import com.autotrader.tests.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WebTablePractices {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        SmartBearUtilities.loginToSmartBear(driver);
    }

    // using the verify order method from smartbearutilities class
    @Test
    public void task4_verify_order(){
        SmartBearUtilities.verifyOrder(driver,"Abuziddin");


    }

}
