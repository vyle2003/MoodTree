package model;

public class Mood {
    public static final Mood ECSTATIC = new Mood("Ecstatic", "#217a34");
    public static final Mood HAPPY = new Mood("Happy", "#8aa62d");
    public static final Mood BORED = new Mood("Bored", "#c77904");
    public static final Mood NEUTRAL = new Mood("Neutral", "#ccc90e");
    public static final Mood SAD = new Mood("Sad", "#6b4713");

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
