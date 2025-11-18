package com.mycompany.mini.cafe;

import java.io.InputStream;
import java.util.Properties;

public class DBConfig {

    public static Properties load() throws Exception {
        Properties props = new Properties();

        InputStream input = DBConfig.class.getClassLoader()
                .getResourceAsStream("config/config.properties");

        if (input == null) {
            throw new Exception("config.properties not found in resources!");
        }

        props.load(input);
        return props;
    }
}
