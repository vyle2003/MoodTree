package ui;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.*;

@Controller
@EnableAutoConfiguration
public class AccountManagement extends Application{

    @RequestMapping("/login")
    public String loginForm(@RequestParam("email") String email, @RequestParam("password") String password) {
        String insertSQL = "SELECT COUNT(*) FROM loginInfo WHERE email = ? AND password = ?";
        try {
            Connection dc = new DatabaseConnection().connectDB();
            dc.setAutoCommit(false);
            PreparedStatement preparedStatement = dc.prepareStatement(insertSQL);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    int count = resultSet.getInt(1);
                    if (count > 0) {
                        return "redirect:/calendar.html";
                    } else {
                        return "redirect:/error.html";
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return "redirect:/error.html";
    }

    @RequestMapping("/goCalendar")
    public String goToCalendar() {
        return "redirect:/calendar.html";
    }

    @RequestMapping("/signup")
    public String signUpForm(@RequestParam("username") String username, @RequestParam("email") String email, @RequestParam("password") String password) {
        String insertSQL = "INSERT INTO loginInfo (Username, Email, Password) VALUES (?, ?, ?)";
        System.out.println(username + " " + email + " " + password);
        try {
            Connection dc = new DatabaseConnection().connectDB();
            dc.setAutoCommit(false);
            PreparedStatement preparedStatement = dc.prepareStatement(insertSQL);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, password);
            preparedStatement.executeUpdate();
            dc.commit();
            Statement statement = dc.createStatement();
            String query = "SELECT * FROM loginInfo";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String user = resultSet.getString("Username"); // Replace 'id' with the actual column name
                String em = resultSet.getString("Email"); // Replace 'name' with the actual column name
                String pass = resultSet.getString("Password");
                System.out.println("username: " + user + " em: " + em + "pass: " + pass);
            }
            dc.close();
            System.out.println("This worked");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "redirect:/main.html";
    }
}
