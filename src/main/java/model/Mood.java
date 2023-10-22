package model;

import ui.Application;

public class Mood extends Application {
    public static final Mood ECSTATIC = new Mood("Ecstatic", "#217a34");
    public static final Mood HAPPY = new Mood("Happy", "#88c72a");
    public static final Mood NEUTRAL = new Mood("Neutral", "#e6c957");
    public static final Mood BORED = new Mood("Bored", "#ed6226");
    public static final Mood SAD = new Mood("Sad", "#9c5c41");

    private String moodName;
    private String hexColor;

    public Mood(String moodName, String hexColor) {
        this.moodName = moodName;
        this.hexColor = hexColor;
    }

    public String getMoodName() {
        return moodName;
    }

    public String getHexColor() {
        return hexColor;
    }
}
