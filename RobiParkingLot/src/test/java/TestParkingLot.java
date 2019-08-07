import hu.flowacademy.ParkingLot;
import hu.flowacademy.Vehicle.Car;
import hu.flowacademy.Vehicle.Vehicle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestParkingLot {

           ParkingLot<Vehicle> vehicleParking = new ParkingLot<Vehicle>(300);


    @Test
    public void testAddAuto(){
        vehicleParking.add(new Car("z", "kuka"));
        Assertions.assertEquals(1, vehicleParking.getCarCount());
    }
}
