package hu.flowacademy.Vehicle;

public class Motorcycle extends Vehicle {
    private final int wheels = 2;

    public Motorcycle(String type, String manufacturer) {
        super(type, manufacturer);
    }

    public int getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "type='" + type + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", wheels='"+ wheels + '\'' +
                '}';
    }
}
