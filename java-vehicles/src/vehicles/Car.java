package vehicles;

public class Car extends Vehicle{

    private int wheels;

    public Car(String type, int year, int wheels){
        super(type, year);
        this.wheels = wheels;
    }


@Override
    public String toString(){
        return super.toString() + ", Kerekek száma: " + wheels;
}

    public void sound() {
        System.out.println("brrrrrrrr autó vagyok");
    }

    public int getWheels(){
        return wheels;
    }

    public void setWheels(int wheels){
        this.wheels = wheels;
    }
}
