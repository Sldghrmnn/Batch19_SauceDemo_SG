package com.sauceDemo.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties;

    static {
        try {
            String path = "configuration.properties";
            /**
             * FileInputStream -> Javaya dışarıdan veri almak için kullanılır
             * FileOutputStream - > Javadan dışaruya veri vermek için kullanılır.
             */
            FileInputStream input = new FileInputStream(path);

            properties = new Properties();

            properties.load(input);
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String get(String keyName){
        return properties.getProperty(keyName);
    }

}
