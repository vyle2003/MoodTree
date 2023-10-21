package ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Controller
public class AccountManagement extends Application{

    @RequestMapping("/index")
    public String loginForm(@RequestParam("email") String email, @RequestParam("password") String password) {
        return null;
    }

    @RequestMapping("/signup")
    public String signUpForm(@RequestParam("username") String username, @RequestParam("email") String email, @RequestParam("password") String password) {
        String insertSQL = "INSERT INTO users (username, password) VALUES (?, ?)";
        try {
            Connection dc = new DatabaseConnection().connectDB();
            PreparedStatement preparedStatement = dc.prepareStatement(insertSQL);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, password);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "main";
    }
}
