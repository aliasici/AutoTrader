package com.autotrader.tests.base;

import com.autotrader.tests.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {
    // ABSTRACT because no body can able to create an object of this class that is WHAT I WANT
    /*
- Testbase is a class that will hold the common variables and setup/teardown methods
- So that we can just extend to TestBase class and not have to re-write or copy/paste the same statements again and again.
- Repeated statements that we are going to be eliminating:
- @BeforeMethod, @AfterMethod
- maximize
- implicit wait etc.
- So far we don't have a parent class for our tests.
- TestBase class will be the parent of all of our tests.
- TestBase is NOT a Utility class, it is a parent class for our tests so that we can extend to it and get common
  setups, and variables.
     */

    protected WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @AfterMethod
    public void tearDown(){
        driver.close();

    }



}
