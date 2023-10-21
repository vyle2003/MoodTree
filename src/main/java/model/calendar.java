package model;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class calendar {
    private String title;
    LocalDate date = LocalDate.now();
    private String mood;

    // Get mood
    public String getMood() {
        return(mood);
    }

    // Get title
    public String getTitle() {
        return(title);
    }

    //Get date
    public int getDate() {
        return(date.getDayOfMonth());
    }

    //Get month
    public int getMonth() {
        return(date.getMonthValue());
    }

    //Get year
    public int getYear() {
        return(date.getYear());
    }

    //Set mood
    public void setMood(String mood) {
        this.mood = mood;
    }

        

    
        

}