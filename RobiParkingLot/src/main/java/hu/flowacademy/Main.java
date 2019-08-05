package hu.flowacademy;

import hu.flowacademy.Vehicle.Car;
import hu.flowacademy.Vehicle.Motorcycle;
import hu.flowacademy.Vehicle.Vehicle;

public class Main {

    public static void main(String[] args) {

            Car audi = new Car("A4", "AUDI");
            Motorcycle yamaha = new Motorcycle("LE", "Yamaha");
            Motorcycle suzuki = new Motorcycle("FEL", "Suzuki");
            ParkingLot<Vehicle> parkinglot = new ParkingLot<>();
            try {
                parkinglot.addVehicle(audi);
                parkinglot.addVehicle(yamaha);
                parkinglot.addVehicle(suzuki);
            }catch (OverflowException e){
                e.printStackTrace();
            }

        System.out.println(parkinglot.toString());
        System.out.println(parkinglot.getCars());
        System.out.println(parkinglot.getMotorcycles());

    }
}
