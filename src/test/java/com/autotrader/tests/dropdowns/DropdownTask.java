package com.autotrader.tests.dropdowns;

import com.autotrader.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownTask {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/dropdown");

    }
    @Test
    public void test_verify_state_dropdown() throws InterruptedException{
        // we need to locate dropdown
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        // select illinois
        stateDropdown.selectByVisibleText("Illinois");
        Thread.sleep(3000);
        // select virginia by value
        stateDropdown.selectByValue("VA");
        Thread.sleep(3000);
        //select california by index number
        stateDropdown.selectByIndex(5);
        //verify final selected option is California
        String expectedResult = "California";
        String actualResult = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualResult,expectedResult,"Actual vs expected is not equal");
    }

    @Test
    public void date_dropdown_verification(){
        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        yearDropdown.selectByVisibleText("1921");

        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        monthDropdown.selectByValue("11");

        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        dayDropdown.selectByIndex(0);

        String expectedYear = "1921";
        String expectedMonth = "December";
        String expectedDay = "1";

        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualYear,expectedYear,"Actual year vs expected year not equal");
        Assert.assertEquals(actualMonth,expectedMonth,"Actual month vs expected month not equal");
        Assert.assertEquals(actualDay,expectedDay,"Actual day vs expected day not eaqual");

        Assert.assertTrue(actualDay.equals(expectedDay),"My test PASSED");




    }
}
