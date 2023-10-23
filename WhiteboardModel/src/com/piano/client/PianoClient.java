package com.piano.client;

import com.piano.Piano;
import com.piano.PianoBrands;
import com.piano.PianoModes;

class PianoClient {
    // application starting point \o/
    public static void main(String[] args) {
        //piano instance #1 - here I've demonstrated how to instantiate a new object, as well as change modes via enums.
        Piano p1 = new Piano();
        p1.turnon();
        p1.setMode(PianoModes.ELECTRIC);
        p1.setSong("Wayward Daughter");
        p1.play();
        p1.turnoff();
        System.out.println(p1);


        //piano instance #2
        Piano p2 = new Piano(PianoBrands.KAWAI, PianoModes.GRAND_PIANO);
        p2.turnon();
        p2.setSong("Stone Tower Temple");
        p2.play();
        p2.turnoff();
        System.out.println(p2);


        //piano instance #3 - by using a brand that is not available, it produces an error code (0_0)
        Piano p3 = new Piano(PianoBrands.FENDER_RHODES, PianoModes.ELECTRIC,30);
        p3.turnon();
        p3.setSong("Song of the Ancients");
        p3.play();
        p3.turnoff();
        System.out.println(p3);
    }
}
