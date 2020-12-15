package com.autotrader.tests.testNG;


import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Introduction {

    @BeforeClass
    public void setUpClass(){
        System.out.println("Before class is running...");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("After class is running...");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before method is running...");

    }
    @AfterMethod
    public void tearDownMethod(){
        System.out.println("After method is running");
    }

    @Test
    public void test1(){
        System.out.println("Test1 is running...");

    }
    @Test
    public void test2(){
        System.out.println("Test2 is running...");
    }

    @Test
    public void test3(){
        String str1 = "TestNG";
        String str2 = "TestNG";
        String str3 = "asdfasdf";

        Assert.assertTrue(str1.equals(str2));

        Assert.assertTrue(str1.equals(str3) , "Str1 is not equal to Str3.");

        System.out.println("JUst checking if this line will run????? ");

        Assert.assertEquals(str1, str2, "Failure message just in case str1 is not equals to str2"); //STATIC METHOD...
        //  What is .m2

        /*
        TestNG is a testing framework inspired from JUnit and NUnit but introducing some new functionalities
        that make it more powerful and easier to use, such as:

        Annotations.
        Run your tests in arbitrarily big thread pools with various policies available
        (all methods in their own thread, one thread per test class, etc...).
        Test that your code is multithread safe.
        Flexible test configuration.
        Support for data-driven testing (with @DataProvider).
        Support for parameters.
        Powerful execution model (no more TestSuite).
        Supported by a variety of tools and plug-ins (Eclipse, IDEA, Maven, etc...).
        Embeds BeanShell for further flexibility.
        Default JDK functions for runtime and logging (no dependencies).
        Dependent methods for application server testing.
        TestNG is designed to cover all categories of tests:  unit, functional, end-to-end, integration, etc...

        I started TestNG out of frustration for some JUnit deficiencies which I have documented on my weblog here
        and here Reading these entries might give you a better idea of the goal I am trying to achieve with TestNG.
        You can also check out a quick overview of the main features and an article describing a very concrete example
        where the combined use of several TestNG's features provides for a very intuitive and maintainable testing design.


      */


    }
}
