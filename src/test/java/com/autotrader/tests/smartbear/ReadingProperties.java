package com.autotrader.tests.smartbear;

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

        properties.getProperty("browser");

        file.close();


    }

}
