package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/test_db";
    private static final String USER = "forest";
    private static final String PASSWORD = "forest";

    public static Connection getSQLConnection() {
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            connection.setAutoCommit(false);
            return connection;
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
        return null;
    }
}
