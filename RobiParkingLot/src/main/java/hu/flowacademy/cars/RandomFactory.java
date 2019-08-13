package hu.flowacademy.cars;

import java.util.Random;

public class RandomFactory{
    public Car getRandomCar(){
        return FactoryMaker.makeFactory(FactoryMaker.FactoryType.values()[new Random().nextInt(FactoryMaker.FactoryType.values().length)]).createCar("asda", 200, 50, Color.BLACK, true);
    }
}
