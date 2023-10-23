package com.piano.test;

import com.piano.Piano;

 class PianoVolumeTest {
    public static void main(String[] args) {
        //create a new piano
        Piano p1 = new Piano();
        System.out.println(p1);

        p1.setVolume(0);
        System.out.println(p1);

        p1.setVolume(100);
        System.out.println(p1);

        p1.setVolume(101);
        System.out.println(p1);

    }


}