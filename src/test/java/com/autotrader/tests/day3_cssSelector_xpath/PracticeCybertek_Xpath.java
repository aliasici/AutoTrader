package com.autotrader.tests.day3_cssSelector_xpath;

import com.autotrader.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeCybertek_Xpath {
    public static void main(String[] args) {
        /*
             #1 - ABSOLUTE XPATH:
            - Absolute xpath starts with single forward slash --> /
            - Absolute xpath starts looking from the root element in HTML page
            ****This is not a reliable locator.
            - It will easily break when there is anything simple changes in the HTML structure
            - TRY AVOID USING IT.

            <html>
            <head>
            </head>
            <body>
            <div>
            <h3>this is my header</h3>
            </div>
            </body>
            </html>

            /html/body/div/h3

            #2 - RELATIVE XPATH
            - Relative xpath starts with double slash --> //
            - Starting with double slash means you can look/start from anywhere in the HTML code
            - This is a lot more reliable then absolute xpath
            - This is a lot more specific then absolute xpath
            //tagName --> simple syntax that will find and return the first matching tagName
            css syntax: tagName[attribute='value']

            COMMONLY USED XPATH LOCATORS:

            #1- //tagName[@attribute='value']
            #2- //tagName[contains(@attribute, 'value')]
            #3- //tagName[.='text']
            #4- //*[@attribute='value']

            EXPLANATIONS:

            #1- //tagName[@attribute='value']
            -> Looks for the matching tagName with given attribute and value.

            #2- //tagName[contains(@attribute, 'value')]
            -> Looks for the matching tagname with attribute that contains given value

            #3- //tagName[.='text']
            -> Looks for exact text match in webElement

            #4- //*[@attribute='value']
            -> Using * does not care about the tag name, only looks for given attribute and attribute value


         */

        //TASK================

        //"http://practice.cybertekschool.com/multiple_buttons

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //locate button 2 and click on it
        //only using xpath

        //[@attribute='value']

        WebElement  buttonTwo = driver.findElement(By.xpath("//button[@name='button2']"));
        buttonTwo.click();

        WebElement textResult = driver.findElement(By.id("result"));

        String actualText = textResult.getText();
        String expectedResult = "Clicked on button two!";

        if(actualText.equals(expectedResult)){
            System.out.println("Result displayed PASSED!");
        }else{
            System.out.println("Result displayed FAILED!!!");
        }


    }
}
