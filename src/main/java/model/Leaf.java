package main.java.model;

import model.Mood;

import java.util.Scanner;

public class Leaf {
    private Mood mood;
    private String description;


    //Initialize
    public Leaf() {

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