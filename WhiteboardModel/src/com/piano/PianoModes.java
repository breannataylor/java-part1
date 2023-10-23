package com.piano;

public enum PianoModes {
    ELECTRIC("Electric"),
    GRAND_PIANO("Grand"),
    ORGAN("Organ");

    //fields, ctors, and methods

    private String display;

    PianoModes (String display) {
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }

    public String toString() {
        return display;
    }

}
