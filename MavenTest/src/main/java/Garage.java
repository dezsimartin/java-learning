import java.io.Serializable;

public class Garage implements Serializable {

    private int sqmeter;
    private transient String name;          //transient -> serializable nem fogja kiírni fájlba, mezője lesz, alapértékeket kap, pl stringnél null, boolean false etc.
    private  boolean isFull;
    private Car car;


    public Garage(int sqmeter, String name, boolean isFull, Car car) {
        this.sqmeter = sqmeter;
        this.name = name;
        this.isFull = isFull;
        this.car = car;
    }


    public int getSqmeter() {
        return sqmeter;
    }

    public void setSqmeter(int sqmeter) {
        this.sqmeter = sqmeter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "sqmeter=" + sqmeter +
                ", name='" + name + '\'' +
                ", isFull=" + isFull +
                ", car=" + car +
                '}';
    }
}
