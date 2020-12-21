package com.autotrader.tests.smartbear;

import com.autotrader.tests.utilities.ConfigurationReader;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_file() throws IOException {
        // Properties: Use Properties class object
        // we create properties object to be able to read configuration.properties
        //import from java.util

        Properties properties = new Properties();
        // fileinputstream opens the file

        String path = "configuration.properties";

        // we need to pass the path file we want to open in JVM
        FileInputStream file = new FileInputStream(path);

        // we will load rhe file

        properties.load(file);

        // We read from the file
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));

        // Close the file
        file.close();

    }

    @Test
    public void using_properties_utility_method(){
        //This will read the given "key's" value and return it
        // as a String
        System.out.println("ConfigurationReader.getProperty(\"browser\") = " + ConfigurationReader.getProperty("browser"));
        System.out.println("ConfigurationReader.getProperty(\"smartbearUrl\") = " + ConfigurationReader.getProperty("smartbearUrl"));
    }

}


