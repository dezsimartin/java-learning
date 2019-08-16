package hu.flowacademy;

public class Bor extends Ital implements Alkoholos{
    private String szolofajta;
    private String iz;
    private double alkoholTartalom;

    public Bor(String szolofajta, String iz, int alkoholTartalom) {
        this.szolofajta = szolofajta;
        this.iz = iz;
        this.alkoholTartalom = alkoholTartalom;
    }

    @Override
    public String toString() {
        return super.toString() + " Alkoholtartalom: " + mennyiAlkoholtTartalmaz();
    }

    @Override
    public String mibolKeszult() {
        return szolofajta;
    }

    @Override
    public String milyenIzu() {
        return iz;
    }

    @Override
    public double mennyiAlkoholtTartalmaz() {
        return alkoholTartalom;
    }
}
