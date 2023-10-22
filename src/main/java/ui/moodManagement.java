package ui;

import model.Mood;
import model.Leaf;

import org.springframework.stereotype.Controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.sql.Timestamp;


@Controller
public class moodManagement {
    public static void saveMoodEntry(Leaf leaf) throws SQLException {
        String insertQuery = "INSERT INTO user_moods (mood, description, entry_date) VALUES (?, ?, ?)";
        try (Connection connection = Application.connectDB();
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {

            preparedStatement.setString(1, leaf.getMood().getMoodName());
            preparedStatement.setString(2, leaf.getDescription());
            preparedStatement.setTimestamp(3, new Timestamp(new Date().getTime()));

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
