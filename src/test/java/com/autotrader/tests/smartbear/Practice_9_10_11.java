package com.autotrader.tests.smartbear;

import com.autotrader.tests.utilities.BrowserUtils;
import com.autotrader.tests.utilities.SmartBearUtilities;
import com.autotrader.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Practice_9_10_11 {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        // I called the method from SmartBearUtilities
        SmartBearUtilities.loginToSmartBear(driver);

        BrowserUtils.wait(3);


    }
    @Test
    public void p9_delete_order_task(){

       // WebElement markSmithCheckbox = driver.findElement(By.xpath("//td[.='Mark Smith']/preceding-sibling::td[1]"));
        //WebElement markSmithCheckbox = driver.findElement(By.xpath("//td[.='Mark Smith']/../td[1]"));

        WebElement markSmithCheckBox = driver.findElement(By.xpath("//td[.='Mark Smith']/../td[1]"));
        markSmithCheckBox.click();
        BrowserUtils.wait(3);

        WebElement deleteSelected = driver.findElement(By.id("ctl00_MainContent_btnDelete"));

        deleteSelected.click();
        BrowserUtils.wait(3);


    }


}
