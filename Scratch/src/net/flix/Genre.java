package net.flix;

public enum Genre {
    ACTION("Action!"),
    COMEDY("Comedy :D"),
    HORROR("Maximum Spookage"),
    HISTORICAL("Historical"),
    SPORTS_ROMANCE("Sports Romance XO"),
    WESTERN("Western");

    //everything under here is regular class definition stuff: fields, ctors, methods
    private final String display;

    Genre (String display) { // Enum constructors are automatically private
        this.display = display;
    }

    public String display() {       // this is a standard getter, it just isn't named 'getDisplay'
        return display;
    }

    public String toString() {
        return display;
    }
}
