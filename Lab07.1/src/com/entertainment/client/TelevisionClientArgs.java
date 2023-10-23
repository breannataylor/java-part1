package com.entertainment.client;/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

import com.entertainment.DisplayType;
import com.entertainment.Television;

import java.util.Arrays;

/**
 * Intended usage (by human):
 *  $ java com.entertainment.client.TelevisionClientArgs <brand> <volume> <display>
 * 
 * Example:
 *  $ java com.entertainment.client.TelevisionClientArgs Samsung 32 PLASMA
 *
 * GOAL:
 *  Create an instance of com.entertainment.Television with the specifications (values) provided by the user.
 */
class TelevisionClientArgs {

    public static void main(String[] args) {
        // must first check for the presence of your (required) 3 arguments
        if (args.length < 3) {
            String usage = "Usage: java com.entertainment.client.TelevisionClientArgs <brand> <volume> <display>";
            String example = "Example: java com.entertainment.client.TelevisionClientArgs Samsung 32 PLASMA";
            String note1 = "Valid brands are: " + Arrays.toString(Television.VALID_BRANDS);
            String note2 = String.format("The volume must be %s to %s (inclusive).", Television.MIN_VOLUME, Television.MAX_VOLUME);
            String note3 = "Note: supported displays are " + Arrays.toString(DisplayType.values());
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note1);
            System.out.println(note2);
            System.out.println(note3);
            return;  // early return from main(), application exits
        }

        // at this point, you can safely proceed, because you got your arguments
        // first, let's just show that we got them
        System.out.println("You provided " + args.length + " arguments");

        //convert Strings as necessary:
        //brand is a string, volume needs to be an int, and display should be a com.entertainment.DisplayType

        String brand = args[0];
        int volume = Integer.parseInt(args[1]);
        DisplayType display = DisplayType.valueOf(args[2].toUpperCase());

        //Create a com.entertainment.Television object from these 3 ingredients

        Television tv = new Television(brand, volume, display);
        System.out.println(tv);
    }
}