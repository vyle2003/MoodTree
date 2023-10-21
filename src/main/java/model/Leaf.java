package model;

import model.Mood;

import java.util.Scanner;

public class Leaf {
    private Mood mood;
    private String description;


    //Constructor
    public Leaf(Mood mood, String description) {
        this.mood = mood;
        this.description = description;
    }
    
    //GETTER
    public Mood getMood() {
        return this.mood;
    }

    //SETTER
    public void setMood(Mood mood) {
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