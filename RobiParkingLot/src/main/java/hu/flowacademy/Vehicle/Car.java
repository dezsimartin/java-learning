package hu.flowacademy.Vehicle;

public class Car extends Vehicle {
    private final int wheels = 4;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Car(String type, String manufacturer) {
        super(type, manufacturer);
    }

    @Override
    public String getID() {
        return null;
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
