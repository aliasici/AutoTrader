package com.autotrader.tests.day3_cssSelector_xpath;

import com.autotrader.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CybertekLinkVerification {
    public static void main(String[] args) {

        //TC #3: PracticeCybertek/ForgotPassword URL verification
        //1. Open Chrome browser
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //3. Enter any email into input box
        //driver.findElement(By.name("email")).sendKeys("anyemail@domain.com");

       // driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abuziddin@gmail.com"+ Keys.ENTER);
//
//        WebElement inputBox = driver.findElement(By.xpath("//input[@type='text']"));
//        inputBox.sendKeys("abuziddin@gmail.com"+ Keys.ENTER);
//
        // alternative logic
        WebElement emailInputBox = driver.findElement(By.name("email"));
        emailInputBox.sendKeys("anyemail@domain.com");

        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();


        //5. Verify URL contains:
        //Expected: “email_sent”

        //http://practice.cybertekschool.com/email_sent

        String expectedInUrl = "email_sent";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedInUrl)){
            System.out.println("URL verification PASSED!");
        }else {
            System.out.println("URL verification FAILED!!!");
        }
        //6. Verify textbox displayed the content as expected.
        //Expected: “Your e-mail’s been sent!”

        //verify the text
        WebElement confirmationMessage =  driver.findElement(By.name("confirmation_message"));

        String expectedText = "Your e-mail's been sent!";
        String actualText = confirmationMessage.getText(); // bu logic cok guzel oldu..

        System.out.println("actualText = " + actualText);
        System.out.println("expectedText = " + expectedText);

        if(actualText.equals(expectedText)){
            System.out.println("Header text value verification PASSED!");
        }else{
            System.out.println("Header text value verification FAILED!!!");
        }

        //verify if the web element is displayed or not

        if(confirmationMessage.isDisplayed()){
            System.out.println("Confirmation is displayed and verification PASSED!");
        }else {
            System.out.println("Confirmation is NOT displayed and verification PASSED!");
        }





    }
}
