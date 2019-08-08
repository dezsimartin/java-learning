package hu.flowacademy;

public class Car implements Comparable<Car> {
    private int horsepower;
    private int ccm;

    public Car(int horsepower, int ccm) {
        this.horsepower = horsepower;
        this.ccm = ccm;
    }

    @Override
    public String toString() {
        return "Car{" +
                "horsepower=" + horsepower +
                ", ccm=" + ccm +
                '}';
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getCcm() {
        return ccm;
    }

    public void setCcm(int ccm) {
        this.ccm = ccm;
    }

    @Override
    public int compareTo(Car o) {                   // int 1(nagyobb) 0(egyenlő) -1(paraméterben levő nagyobb) -> értékeket vehet fel
        int myPower = this.horsepower * this.ccm;
        int paramPower = o.horsepower * o.ccm;
        if(myPower > paramPower) return 1;
        if(myPower < paramPower) return -1;
        return 0;
    }
}
