package com.autotrader.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException{

        // set up driver
        //We just call methods from WebDriverManager dependencies to set up our browser driver
        WebDriverManager.chromedriver().setup();

        // create instance of the driver
        WebDriver driver = new ChromeDriver();

        // use the driver instance to test selenium

        driver.get("https://www.google.com");
        Thread.sleep(2000);

        System.out.println("title of the page is: " +driver.getTitle());

        driver.navigate().to("https://wwww.facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();

    }
}
