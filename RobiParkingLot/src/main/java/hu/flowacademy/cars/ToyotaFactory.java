package hu.flowacademy.cars;

public class ToyotaFactory implements CarFactory {

    @Override
    public Car createCar(String model, int ccm, int hp, Color color, boolean isElectric) {
        return new Toyota(model, ccm, hp, color, isElectric);
    }
}
