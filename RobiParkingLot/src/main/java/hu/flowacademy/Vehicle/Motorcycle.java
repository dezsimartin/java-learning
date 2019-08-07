package hu.flowacademy.Vehicle;

public class Motorcycle extends Vehicle {
    private final int wheels = 2;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Motorcycle(String type, String manufacturer) {
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
        return "Motorcycle{" +
                "type='" + type + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", wheels='"+ wheels + '\'' +
                '}';
    }
}
