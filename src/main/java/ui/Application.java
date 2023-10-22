package ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        connectDB();
    }

    public static void connectDB() {
        System.out.println("Connecting");
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:src/main/java/UserData.db";
            conn = DriverManager.getConnection(url);
            conn.setAutoCommit(false);
            System.out.println("Connected");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
