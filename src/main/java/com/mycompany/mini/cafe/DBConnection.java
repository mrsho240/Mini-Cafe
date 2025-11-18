package com.mycompany.mini.cafe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnection {

    public static Connection getConnection() throws Exception {
        Properties p = DBConfig.load();
        String url = p.getProperty("db.url");
        String user = p.getProperty("db.user");
        String pass = p.getProperty("db.password");
        return DriverManager.getConnection(url, user, pass);
    }
}
