package hu.flowacademy.cars;

public class Toyota extends Car {

    private String type = "Toyota";

    public Toyota(String model, int ccm, int hp, Color color, boolean isElectric) {
        super(model, ccm, hp, color, isElectric);
    }
}
