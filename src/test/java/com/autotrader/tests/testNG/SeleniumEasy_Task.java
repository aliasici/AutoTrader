package com.autotrader.tests.testNG;

import com.autotrader.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SeleniumEasy_Task {
    public static void main(String[] args) throws InterruptedException {

        //TC #2: SeleniumEasy Checkbox Verification – Section 1
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2. Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html

        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //Locate success message and checkbox under 'single checkbox demo'

        WebElement successCheckbox = driver.findElement(By.xpath("//input[@type='checkbox']"));

        //locate the success message
        WebElement successMessage = driver.findElement(By.xpath("//div[@id='txtAge']"));

        //create a locator to success message and share it in class-chat
        //div[@style='display: block;']
        //div[.='Success - Check box is checked']

        if(!successCheckbox.isSelected() && !successMessage.isDisplayed()){
            System.out.println("Success message is NOT displayed. Verification PASSED!");
        }else{
            System.out.println("Success message is displayed. Verification FAILED!!!");
        }

        //4. Click to checkbox under “Single Checkbox Demo” section
        successCheckbox.click();

        if(successCheckbox.isSelected() && successMessage.isDisplayed()){
            System.out.println("Success message is displayed. Verification PASSED!");
        }else{
            System.out.println("Success message is NOT displayed. Verification FAILED!!!");
        }

        Thread.sleep(3000);
        driver.close();
    }
}
