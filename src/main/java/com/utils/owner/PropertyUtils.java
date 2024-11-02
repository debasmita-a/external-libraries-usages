package com.utils.owner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public final class PropertyUtils {

    private PropertyUtils(){}

    public static String readPropertyFile(String key){
        Properties properties = null;
        FileInputStream propertyFilePath = null;
        try {
            propertyFilePath = new FileInputStream("./src/test/resources/config.properties");
            properties = new Properties();
            properties.load(propertyFilePath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally{
            try{
                propertyFilePath.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return properties.getProperty(key);

    }
}
