package gov.test;

import java.util.Arrays;

class ArraysTest {

    public static void main(String[] args) {
        int[] ages = new int[4];
        ages[0] = 56;
        ages[1] = 50;
        ages[2] = 9;
        ages[3] = 9;
        //for each int age in ages
        for (int age: ages) {
            System.out.printf("The age is: %s\n", age);
        }
        //number of slots in array. Does not tell you which are filled, or what they are filled with
        System.out.printf("This array has %s values\n", ages.length);

        System.out.println(Arrays.toString(ages)); //toString automatically called
        System.out.println();

        double[] temps = {63.3, 56.5, 25.4, 88.0, 45.6, 70.0};

        for (double temp: temps) {
            System.out.printf("The current temperature is: %s\n", temp);
        }
        System.out.println(Arrays.toString(temps));
        System.out.println();

        String[] names = {"BreAnna", "Senna", "Dannielle", "Bunny"};
        for (String name: names)
        System.out.printf("When your name is called, say here: %s\n",name);
    }

}