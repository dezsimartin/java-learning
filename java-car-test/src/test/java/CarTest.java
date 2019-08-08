import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class CarTest {

    //private Car car;
    private Engine engine;
    private FuelTank fuelTank;

    @BeforeAll
    public void setup(){
        engine = Mockito.mock(Engine.class);
        fuelTank = Mockito.mock(FuelTank.class);

       // car = new Car(engine, fuelTank);

    }

    @Test
    public void isRunning(){
        when(engine.isRunning()).thenReturn(true);
        Assertions.assertTrue(engine.isRunning());
    }

}
