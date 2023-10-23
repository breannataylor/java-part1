package com.tick;

/*
 * Client is the code that is making the call for the classes to do things.
 * Application main-class. This is the class definition with the main method.
 *
 * It's purpose is to create a few instances of com.tick.AlarmClock and give them
 * a basic test-drive.
 */
class AlarmClockClient {
    // application "entry point" or starting point - the app starts from here.
    public static void main(String[] args) {
        //create an instance of com.tick.AlarmClock and set its properties
        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(7);

        // create a second instance of com.tick.AlarmClock and set its properties
        AlarmClock clock2 = new AlarmClock(AlarmClock.MAX_INTERVAL);

        // create a 3rd com.tick.AlarmClock object, but don't set its properties - so what will they be?
        AlarmClock clock3 = new AlarmClock();

        // To invoke methods on objects, use dot operator - referenceVariable.methodname()
        clock1.snooze();
        clock2.snooze();
        clock3.snooze();

        System.out.println();

        //show their toString() methods in action
        System.out.println(clock1.toString());
        System.out.println(clock2); // toString is automatically called
        System.out.println(clock3);

    }
}