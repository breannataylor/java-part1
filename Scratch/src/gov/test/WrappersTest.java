package gov.test;

class WrappersTest {
    public static void main(String[] args) {
        String ageInput = "30";
        int age = Integer.parseInt(ageInput);                   // if you want an int from a string
        Integer ageInteger = Integer.valueOf(ageInput);         //if you want an Integer wrapper


        String brainCellsInput = "86000000000";
        long brainCells = Long.parseLong(brainCellsInput);      // if you want a long from a string
        Long brainCellsLong = Long.valueOf(brainCellsInput);    // if you want a Long wrapper from a string

        String shoeSizeInput = "9.5";
        double shoeSize = Double.parseDouble(shoeSizeInput);    // if you want a double from a string
        Double shoeSizeDouble = Double.valueOf(shoeSizeInput);  // if you want a Double wrapper from a string

        String sunnyInput = "true";
        boolean sunny = Boolean.parseBoolean(sunnyInput);       // if you want a boolean from a string
        Boolean sunnyBoolean = Boolean.valueOf(sunnyInput);     // if you want a Boolean wrapper from a string


    }

}