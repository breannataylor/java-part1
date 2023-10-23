package edu.math;

/*
 * All- static class - i.e a class with only static methods
 */
class Calculator {

    public static double add(double a, double b) {
       return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static boolean isEven (int value) {
        return value % 2 == 0;
    }

    /*
     * The Math class contains methods for performing basic numeric operations.
     * the Math.random only picks a random number between 0 and 1.
     *
     * Returns a random integer between 1 and 19 (inclusive)
     *
     * HINT: see a class called Math (package java.lang), look for a helpful method here.
     * NOTE: The methods in the math class are all "static," which means you call them as:
     * Math.methodName()
     *
     * When you have code that calls another method, find a way to cheat.
     *
     * numberGenerator()
     * numGen()
     * randomInt()
     * mathBoy()
     */
    public static int randomInt() {

        //delegate to the min-max version, passion 1 for the min, and 19 for the max
        return randomInt(1, 19);

        // multiply 18 and add 1
        // double scaled = (Math.random()*19) + 1; // 1.00000 to 19.99999
        // return (int) scaled; //explicit downcast from double to int (lop off decimal)

    }

    /*
     * Return a random integer between min and max (inclusive)
     * Overloading - when two methods have same name, but function differently.
     * The randomInt method above doesn't have an argument, however the one below does
     *
     * CHALLENGE: implement this. Delete return 0; and do it for real.
     */

    public static int randomInt(int min, int max) {
        double rand = Math.random();                // 0.00000 to 0.99999
        double scaled = rand * (max - min + 1);        // 1.00000 to 15.99999
        double raised = scaled + min;               // 5.00000 to 20.99999
        return (int) raised;                        // 5 to 20

    }
    //varargs - inside here is actually an array
    public static double average(int first, int...rest) {
        double result;
        double sum = first;

        for (int value : rest ) {
            sum = sum + value;

        }
        result = sum / (rest.length + 1);
        return result;
    }
}