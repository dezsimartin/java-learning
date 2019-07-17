package main;

import vehicles.Boat;
import vehicles.Car;

public class Main {

    public static void main(String[] args) {

        Car auto = new Car("Mazda", 1960,4);
        Boat hajo = new Boat("Nagy", 2010, true);

        System.out.println(auto.toString());
        System.out.println(hajo.toString());
        auto.sound();
        hajo.sound();
        System.out.println(auto.getWheels());
        hajo.setYear(1807);
        System.out.println(hajo.toString());
    }
}
