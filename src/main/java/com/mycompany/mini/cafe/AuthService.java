package com.mycompany.mini.cafe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AuthService {

    public static String login(String username, String password) {
        try (Connection conn = DBConnection.getConnection()) {

            String sql = "SELECT * FROM member WHERE username = ? AND password = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, username);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return rs.getString("role"); 
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null; 
    }
}
