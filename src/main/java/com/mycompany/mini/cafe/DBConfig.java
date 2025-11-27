package com.mycompany.mini.cafe;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class DBConfig {

    public static Properties load() throws Exception {
        Properties props = new Properties();

        File externalConfig = new File("config/config.properties");
        
        if (externalConfig.exists()) {
            System.out.println("Loading config from external file: " + externalConfig.getAbsolutePath());
            try (InputStream input = new FileInputStream(externalConfig)) {
                 props.load(input);
                 return props;
            } catch (Exception e) {
                System.err.println("Error loading external config: " + e.getMessage());
            }
        }
        // -----------------------

        System.out.println("Loading config from internal resources...");
        
        InputStream input = DBConfig.class.getClassLoader().getResourceAsStream("config.properties"); 
        
        if (input == null) {
             input = DBConfig.class.getClassLoader().getResourceAsStream("config/config.properties");
        }

        if (input == null) {
            throw new Exception("config.properties not found in both external and internal resources!");
        }

        props.load(input);
        return props;
    }
}