package hu.flowacademy.cars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class FactoryMakerTest {

    @Test
    public void testMakeFactory(){
       CarFactory carFactory = FactoryMaker.makeFactory(FactoryMaker.FactoryType.values()[new Random().nextInt(FactoryMaker.FactoryType.values().length)]);
        Car car = carFactory.createCar("valami", 200, 150, Color.BLACK, true);
        Assertions.assertNotNull(car);
    }
}