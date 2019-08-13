package hu.flowacademy.cars;

public class FactoryMaker {

    public static CarFactory makeFactory(FactoryType type){
        return type.makeFactory();
    }

    public enum FactoryType {
        AUDI{
            @Override
            public CarFactory makeFactory() {
                return new AudiFactory();
            }
        },
        LADA {
            @Override
            public CarFactory makeFactory() {
                return new LadaFactory();
            }
        },
        TOYOTA {
            @Override
            public CarFactory makeFactory() {
                return new ToyotaFactory();
            }
        };

        public abstract CarFactory makeFactory();
    }
}
