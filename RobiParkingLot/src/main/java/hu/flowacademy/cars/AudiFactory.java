package hu.flowacademy.cars;

public class AudiFactory implements CarFactory {

    @Override
    public Car createCar(String model, int ccm, int hp, Color color, boolean isElectric) {
        return new Audi(model, ccm, hp, color, isElectric);
    }
}
