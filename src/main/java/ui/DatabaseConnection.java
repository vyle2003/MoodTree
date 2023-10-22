package ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public Connection connectDB() {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:src/main/java/UserData.db";
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }
}
//test