package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private final String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS
    /*
     * OPTION 1: try-catch-finally and handle. The exception stops here.
      public void goToWork() {
        Car c = new Car("ASTRA12", "Hyundai", "Kona");

        try {
            c.start();
            c.moveTo("West Seattle");
        } catch (DestinationUnreachableException e) {
            System.out.println(e.getMessage()); //to string() automatically called
        }
        finally {
            c.stop();
        }
    }
    */

     /* OPTION 2: Ignore the exception. I'm not dealing with it.
      * We use a try finally here, to guarantee a stop() gets called. BUT since there is no catch,
      * BUT since there is no catch, we are still NOT handling the exception.
      */

    /*
    public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("ASTRA12", "Hyundai", "Kona");
        try {
            c.start();
            c.moveTo("West Seattle");
        } finally {
            c.stop();

        }
    }
     */

    /*
     * OPTION 3: try-catch the exception, respond in some way, then re-throw it.
     * We still use finally for the guaranteed call to stop()
     */

    /*
     public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("ASTRA12", "Hyundai", "Kona");

        try {
            c.start();
            c.moveTo("West Seattle");
        } catch (DestinationUnreachableException e) {
            // use JavaMail API to send email to Lisa Herbold to complain
            throw e;
        }
         finally {
            c.stop();
        }

    }
     */

    /*
     * OPTION 4: try catch the exception, but throw a different one.
     */

    public void goToWork() throws WorkException {
        Car c = new Car("ASTRA12", "Hyundai", "Kona");

        try {
            c.start();
            c.moveTo("West Seattle");
        } catch (DestinationUnreachableException e) {
            // use JavaMail API to send email to Lisa Herbold to complain
            throw new WorkException("Unable to get to work.", e);
        }
        finally {
            c.stop();
        }

    }


    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}