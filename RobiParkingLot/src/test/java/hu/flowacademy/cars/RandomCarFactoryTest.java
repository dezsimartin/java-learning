package hu.flowacademy.cars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomCarFactoryTest {

    @Test
    void createCar() {

        Assertions.assertNotNull(new RandomCarFactory().createCar("TT", 300, 500, Color.BLACK, true));
    }                   //visszakapunk autót, olyan típussal kapja e amit létrehoztunk

}