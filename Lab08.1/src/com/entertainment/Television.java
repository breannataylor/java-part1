package com.entertainment;

import java.util.Arrays;

/*
 * Business class to model the workings of a television.
 */
public class Television {
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static final String[] VALID_BRANDS = {"Samsung", "Sony", "LG", "Toshiba"};
    private static int instanceCount = 0;
    // attributes or properties - aka 'fields' or 'instance variables' in Java.
    private String brand = "Toshiba";
    private int volume = 1;
    private DisplayType display = DisplayType.LED;  //otherwise, it would be null. All class types are null.

    //Television HAS-A tuner
    // instatiated internally, not exposed. Each TV will have a tuner inside of it
    private final Tuner tuner = new Tuner();


    //these are for muting methods
    private boolean isMuted; // provide getter only
    private int oldVolume;  // completely hidden no get/set methods
    // constructors
    public Television () {
        instanceCount++;
    }

    public Television (String brand) {
        this();
        setBrand(brand);
    }

    public Television (String brand, int volume) {
        this(brand);
        setVolume(volume);
    }

    public Television (String brand, int volume, DisplayType display) {
        this(brand, volume);
        setDisplay(display);

    }

    // //business "action" methods
    public void changeChannel(String channel) {
        tuner.setChannel(channel); //delegates to contained Tuner object (component object)
    }

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
    public String getCurrentChannel() {
        return tuner.getChannel();
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        // TODO: Use VALID_BRANDS here instead of a switch... it will be a for each loop.
        boolean valid = false;

        if (isValidBrand(brand)) {
            this.brand = brand;
        }

        else {

    }
        if (!valid) {
            System.out.printf("Invalid brand: %s. Must be one of %s.\n",
                    brand, Arrays.toString(VALID_BRANDS));
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

    public void setVolume(int volume) {

        if (volume < MIN_VOLUME || volume > MAX_VOLUME) {
//            System.out.println("Invalid volume input: " + volume +
//            " . Must be a number between " + MIN_VOLUME + " and " + MAX_VOLUME + ".");
            System.out.printf("Invalid volume: %s. Must be between %s and %s. ",
                    volume, MIN_VOLUME, MAX_VOLUME);
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

        return String.format("Television: brand = %s, volume = %s, DisplayType = %s, currentChannel = %s",
                getBrand(), getVolume(), getDisplay(), getCurrentChannel());

//        return "com.entertainment.Television: brand = " + getBrand() + ", volume = " + getVolume() +
//                "Display type: " + getDisplay();
    }
}