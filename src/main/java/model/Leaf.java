package main.java.model;

import java.util.Scanner;

public class Leaf {
    private String mood;
    private String description;
 //   private String darkGreen = "#217a34";
//    private String green = "#8aa62d";
//    private String yellow = "#ccc90e";
//    private String brownish = "#c77904";
//    private String brown = "#6b4713";

    //Initialize
    public Leaf() {
        mood = "Insert Mood ";
        description = "No description provided";
    }

    //Constructor
    public Leaf(String mood, String description) {
        this.mood = mood;
        this.description = description;
    }

    //GETTER
    public String getMood() {
        return this.mood;
    }

    //SETTER
    public void setMood(String mood) {
        this.mood = mood;
    }

    //GETTER
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void inputFromUser() {
        Scanner scanner = new Scanner(System.in);


    }


}