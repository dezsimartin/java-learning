package hu.flowacademy;

public class Gyumolcsle extends Ital{
    private String gyumolcs;
    private String iz;
    private String marka;

    public Gyumolcsle(String gyumolcs, String iz, String marka) {
        this.gyumolcs = gyumolcs;
        this.iz = iz;
        this.marka = marka;
    }

    public String milyenMarkaju(){
        return marka;
    }

    @Override
    public String mibolKeszult() {
        return gyumolcs;
    }

    @Override
    public String milyenIzu() {
        return iz;
    }

    @Override
    public String toString() {
        return super.toString() + " Márka: " + milyenMarkaju();
    }
}
