package com.piano.client;
import com.piano.Piano;
import com.piano.PianoBrands;
import com.piano.PianoModes;
import java.lang.reflect.Array;
import java.util.Arrays;

public class PianoClientArgs {
    public static void main(String[] args) {
        // if statement to check for arguments
        if (args.length < 2) {
            String usage = "Usage: java PianoClientArgs <brand> <mode> <volume>";
            String example = "Example: java PianoClientArgs Kawai ELECTRIC 30";
            String validBrands = "Valid brands: " + Arrays.toString(PianoBrands.values());
            String validMode = "Valid modes: " + Arrays.toString(PianoModes.values());
            String validVolume = String.format("The volume must be between %s and %s.", Piano.MIN_VOLUME, Piano.MAX_VOLUME);
            System.out.println(usage);
            System.out.println(example);
            System.out.println(validBrands);
            System.out.println(validVolume);
            return;
        }
        //convert Strings as necessary:
        PianoBrands brand = PianoBrands.valueOf(args[0].toUpperCase());
        PianoModes mode = PianoModes.valueOf(args[1].toUpperCase());
        int volume = Integer.parseInt(args[2]);

    }

}