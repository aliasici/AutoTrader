package com.autotrader.tests.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    //We created the properties object
    // I am using private and static because I want limited access
    private static Properties properties = new Properties();

    static {
        try {
            //#2- We get the path and pass it into FileInputStream, to open the file
            FileInputStream file = new FileInputStream("configuration.properties");
            //#3- We load the opened file into properties object
            properties.load(file);
            //#5- close the file
            file.close();

        } catch (IOException e) {
            System.out.println("Properties file not found.");
        }
    }
    //#4- We read from file: we will be creating a utility method for reading.
        /*
        Why are we using static block?
        - Because static block runs before everything else and initializes everything in it.
        - Since we are opening files, and reading values we want to make sure that everything (such browser type, url value) are ready for our source code to use it.
        - And also, we cannot directly type java code outside of some kind of block.
         */


    //#4- We read from file: we will be creating a utility method for reading.
    public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);
    }

}
