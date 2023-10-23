package edu.math;

class CalculatorClient {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        double sum = Calculator.add(3, 5); //doubles are passed where doubles are expected
        System.out.println("The sum is " + sum + ".");

        //below, it's okay to pass ints where doubles are expected in the subtract() method
        // at runtime, an implicit upcast is down, converting the ints to doubles
        //a small number can fit in a big basket, but a big number cannot fit into a small basket.
        System.out.println("The difference is " + Calculator.subtract(3, 5) + ".");

        System.out.println("Is 10 an even number? " + Calculator.isEven(10));

        System.out.println("The average is " + Calculator.average(3, 4,5,9,15));

        System.out.println();

        int min = 19;
        int max = 20;
        boolean itWorks = true;
        int result = 0;

        //iteration 1_000_000 times, calling this method and checking the the result against min and max.
        for (int i=0; i < 100_000_000; i++) {
            result = Calculator.randomInt(min, max); //calls the min max version

            if(result < min || result > max) {
                itWorks = false;
                break;
            }
        }
        if (itWorks) {
            System.out.println("Congrats! You do not have a bug.");

        }
        else {
            System.out.println("You have a bug!");
            System.out.println("The value returned is: " + result);
        }
    }
}