package com.tick;

/*
 * Client-side main-class focused on validation testing.
 * BVT (Boundary Value Testing) - we test on the boundaries and just outside them.
 * 0,1 and 20,21 in this case
 */
class AlarmTestValidationTest {

    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock(); {
            clock.setSnoozeInterval(1); // should be accepted
            System.out.println("Snooze Interval: " + clock.getSnoozeInterval());

            clock.setSnoozeInterval(20);
            System.out.println("Snooze Interval: " + clock.getSnoozeInterval());

            clock.setSnoozeInterval(0); //value rejected, will remain at 20.
            System.out.println("Snooze Interval: " + clock.getSnoozeInterval());

            clock.setSnoozeInterval(21); //also rejected, will remain at 20.
            System.out.println("Snooze Interval: " + clock.getSnoozeInterval());

        }

    }
}