import java.nio.channels.AlreadyConnectedException;

/*
 * Application main-class, i.e., the class definition with the main() method.
 * Purpose: create a few instances of Television and give them a test-drive.
 */
class TelevisionClient {
    // application starting point - at runtime, the app starts here
    public static void main(String[] args) {

        System.out.println(Television.getInstanceCount() + " instances have been created.");
        //create an instance of Television and set its properties
        Television tv1 = new Television();
        tv1.setDisplay(DisplayType.PLASMA);
        tv1.turnOn();
        tv1.turnOff();
        System.out.println(tv1); //toString will auto in

        Television tv2 = new Television("Sony", Television.MIN_VOLUME);
        tv2.turnOn();
        tv2.turnOff();
        System.out.println(tv2);


        Television tv3 = new Television("Onn", Television.MAX_VOLUME);
        tv3.turnOn();
        tv3.turnOff();
        System.out.println(tv3);

        System.out.println(Television.getInstanceCount() + " instances have been created.");



    }
}