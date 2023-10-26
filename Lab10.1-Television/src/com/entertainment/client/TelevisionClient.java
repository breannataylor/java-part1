package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.InvalidBrandException;
import com.entertainment.Television;

/*
 * Application main-class, i.e., the class definition with the main() method.
 * Purpose: create a few instances of com.entertainment.Television and give them a test-drive.
 */
class TelevisionClient {
    // application starting point - at runtime, the app starts here
    //do not put exceptions in
    public static void main(String[] args) throws InvalidBrandException {

        System.out.println(Television.getInstanceCount() + " instances have been created.");
        System.out.println();
        //create an instance of Television and set its properties
        Television tv1 = new Television();
        tv1.setBrand("Onn");
        tv1.setVolume(7);
        tv1.setDisplay(DisplayType.PLASMA);
        tv1.turnOn();
        tv1.turnOff();
        System.out.println(tv1); //toString will auto in

        Television tv2 = new Television("Sony", Television.MIN_VOLUME);
        tv2.turnOn();
        tv2.turnOff();
        System.out.println(tv2);


        Television tv3 = new Television("LG", Television.MAX_VOLUME);
        tv3.turnOn();
        tv3.turnOff();
        System.out.println(tv3);

        System.out.println(Television.getInstanceCount() + " instances have been created.");



    }
}