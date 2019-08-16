package hu.flowacademy;

public class FalraHanytBorso implements Alkoholos {
    private double alkoholTartalom;
    private String iz;

    public FalraHanytBorso(double alkoholTartalom, String iz) {
        this.alkoholTartalom = alkoholTartalom;
        this.iz = iz;
    }

    public String milyenIzu(){
        return iz;
    }

    @Override
    public double mennyiAlkoholtTartalmaz() {
        return alkoholTartalom;
    }

    @Override
    public String toString() {
        return "FalraHanytBorso{" +
                "alkoholTartalom=" + mennyiAlkoholtTartalmaz() +
                ", iz='" + milyenIzu() + '\'' +
                '}';
    }
}
