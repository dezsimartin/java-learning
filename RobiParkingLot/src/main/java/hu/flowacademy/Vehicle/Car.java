package hu.flowacademy.Vehicle;

public class Car extends Vehicle {
    private final int wheels = 4;


    public Car(String type, String manufacturer) {
        super(type, manufacturer);
    }

    public int getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", wheels='"+ wheels + '\'' +
                '}';
    }
}
