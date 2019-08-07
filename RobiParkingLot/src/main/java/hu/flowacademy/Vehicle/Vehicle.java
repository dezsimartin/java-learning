package hu.flowacademy.Vehicle;

public abstract class Vehicle {

    protected String type;
    protected String manufacturer;

    public Vehicle(String type, String manufacturer) {
        this.type = type;
        this.manufacturer = manufacturer;
    }

    public abstract String getID();

    public String getType() {
        return type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
