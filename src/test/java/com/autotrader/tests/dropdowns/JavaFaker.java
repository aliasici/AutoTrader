package com.autotrader.tests.dropdowns;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFaker {
    @Test
    public void faker_test(){

        Faker faker = new Faker();

        String firstName = faker.name().firstName();
        System.out.println("firstName = " + firstName);

        String lastName = faker.name().lastName();
        System.out.println("lastName = " + lastName);

        String fullName = faker.name().fullName();
        System.out.println("fullName = " + fullName);
    }
}
