package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    public final static String URL = "jdbc:mysql://localhost:3306/PreProject_1_1_3?allowPublicKeyRetrieval=true&useSSL=false";
    public final static String USER = "root";
    public final static String PASSWORD = "88888888";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
