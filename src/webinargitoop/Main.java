package webinargitoop;

import webinargitoop.test.Boat;

public class Main {
    public static void main(String[] args) {
//        Rideable mazda = new Car();
//        Rideable boat = new Boat();
//        rideRideable(new Car());
//        rideRideable(new Boat());
        Transport transport = new Transport();
//        transport.protectedVal
        Car sedan = new Sedan();
        sedan.start();
    }

    public static void rideRideable(Rideable rideable){
        rideable.ride();
    }
}
