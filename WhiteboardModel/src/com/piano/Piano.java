package com.piano;
import java.util.Arrays;


//Business class for WhiteboardModel
public class Piano {
    // static variables
    public static final int MIN_VOLUME = 1;
    public static final int MAX_VOLUME = 100;

    // instance variables
    private int volume = 1;
    private String song;
    private PianoModes mode;
    private PianoBrands brand;
    private boolean needMaintenance;

    //constructors
    public Piano () {

    }
    public Piano(PianoBrands brand) {
        setBrand(brand);
    }
    public Piano (PianoBrands brand, PianoModes mode) {
        this(brand);
        setMode(mode);
    }
    public Piano (PianoBrands brand, PianoModes mode, int volume) {
        this(brand, mode);
        setVolume(volume);
    }

    //methods - what instances are capable of doing once that are instantiated.
    public void turnon() {
        System.out.println("Turning on " + brand + " " + getMode() + " piano.");

    }

    public void play() {
        System.out.println("I am playing " + song + " . Please enjoy!");
    }

    public void turnoff() {
        System.out.println("Turning off " + brand + " " + getMode() + " piano.\n");

    }

    //accessor methods - getters and setters
    public PianoBrands getBrand() {
        return brand;
    }

    public void setBrand(PianoBrands brand) {

        boolean valid = false;

        if (isValidBrand(brand)) {
            this.brand = brand;
        }

        else {
            System.out.printf("Invalid brand: %s. Must be one of %s.\n",
                    brand, Arrays.toString(PianoBrands.values()));

        }
    }

    private static boolean isValidBrand(PianoBrands brand) {
        boolean valid = false;

        for (PianoBrands currentBrand : PianoBrands.values()) {
            //if (brand.equals(currentBrand)) {
                valid = true;
                break;
            //}
        }
        return valid;
    }

    public PianoModes getMode() {
        return mode;
    }

    public void setMode(PianoModes mode) {
        this.mode = mode;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume < MIN_VOLUME || volume > MAX_VOLUME ){
            System.out.println("Invalid input: " + getVolume() + " . Volume number must be between 1 and 100.");
        }
        else {
            this.volume = volume;
        }

    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public boolean needsMaintenance() {
        return needMaintenance;
    }

    public void setNeedMaintenance(boolean needMaintenance) {
        this.needMaintenance = needMaintenance;
    }

    // toString for basic object information.
    public String toString() {
        return "Brand: " + getBrand() + " Mode: " + getMode() +
                " Volume: " + getVolume() +
                " Needs Maintenance: " + needsMaintenance();
    }
}