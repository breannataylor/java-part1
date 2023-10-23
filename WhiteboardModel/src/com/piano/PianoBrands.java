package com.piano;

public enum PianoBrands {
    YAMAHA("Yamaha"),
    FENDER_RHODES("Fender Rhodes"),
    KAWAI("Kawai");

    //Fields, ctors, and methods go here

    private String display;

    PianoBrands (String display) {
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }

    public String toString() {
        return display;
    }
}