package com.entertainment;

import java.util.Arrays;

/*
 * Business class to model the workings of a television.
 */
public class Television {
    //static fields
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static final String[] VALID_BRANDS = {"Samsung", "Sony", "LG", "Toshiba"};
    private static int instanceCount = 0;

    // attributes or properties - aka 'fields' or 'instance variables' in Java.
    private String brand = "Toshiba";
    private int volume = 1;
    private DisplayType display = DisplayType.LED; //otherwise, it would be null. All class types are null.

    //muting methods
    private boolean isMuted; // provide getter only
    private int oldVolume;  // completely hidden no get/set methods

    // constructors
    public Television () {
        instanceCount++;
    }

    public Television (String brand) throws InvalidBrandException {
        this();
        setBrand(brand);
    }

    public Television (String brand, int volume) throws IllegalArgumentException, InvalidBrandException {
        this(brand);
        setVolume(volume);
    }

    public Television (String brand, int volume, DisplayType display) throws IllegalArgumentException, InvalidBrandException {
        this(brand, volume);
        setDisplay(display);

    }

    // functions or operations - aka 'methods' in Java - what do Television objects DO?
    public void mute() {
        if (!isMuted()) {
            oldVolume = getVolume();
            setVolume(0);
            isMuted = true;
        }
        else {
            setVolume(oldVolume);
            isMuted = false;
        }
    }

    public void turnOn() {
        boolean isConnected = verifyInternetConnection();

        System.out.println("Turning " + brand + " TV on. Turning volume to " + volume +".\n");
    }

    public void turnOff() {
        System.out.println("Turning " + brand + " TV off.");
    }

    //accessor methods - provide 'controlled access' to the object's fields
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) throws InvalidBrandException {
        boolean valid = false;

        if (isValidBrand(brand)) {
            this.brand = brand;
        }

        else {
             throw new InvalidBrandException (
                     String.format("Invalid brand: %s. Must be one of %s.\n",
                    brand, Arrays.toString(VALID_BRANDS)));
        }
    }

    private static boolean isValidBrand(String brand) {
        boolean valid = false;

        for (String currentBrand : VALID_BRANDS) {
            if (brand.equals(currentBrand)) {
                valid = true;
                break;
            }
        }
        return valid;
    }

    public int getVolume() {
        return volume;
    }

    //The client now knows that there may be an IllegalArgumentException
    public void setVolume(int volume) throws IllegalArgumentException {

        if (volume < MIN_VOLUME || volume > MAX_VOLUME) {
            throw new IllegalArgumentException(String.format("Invalid volume: %s. Must be between %s and %s. ",
                    volume, MIN_VOLUME, MAX_VOLUME));
        }
        else {
            this.volume = volume;
            isMuted = false;

        }
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    private  boolean verifyInternetConnection() {
        return true; //fake implementation
    }

    public boolean isMuted() {
        return isMuted;
    }

    //toString - For the diagnostics of the instanced objects.
    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());

        return String.format("Television: brand = %s, volume = %s, DisplayType = %s",
                getBrand(), getVolume(), getDisplay());

    }
}