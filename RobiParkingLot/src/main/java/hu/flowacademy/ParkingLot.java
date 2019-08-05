package hu.flowacademy;


public class ParkingLot<E> {
    private int index;
    public E[] list;

    public ParkingLot(){
        this.index = 0;
        this.list = (E[])new Object[100];
    }

    public void addVehicle(E value) throws OverflowException{
        if(index > 100) {throw new OverflowException("Szop");}
        this.list[index] = value;
        index++;
    }

    public int getAllVehicles(){
        return index;
    }

    public int getCars(){
        int counter = 0;
        for (int i = 0; i < index; i++) {
            if(list[i].getClass().toString().equals("class hu.flowacademy.Vehicle.Car")) {
                counter++;
            }
        }
        return counter;
    }


    public int getMotorcycles(){
        int counter = 0;
        for (int i = 0; i < index; i++) {
            if(list[i].getClass().toString().equals("class hu.flowacademy.Vehicle.Motorcycle")) {
                counter++;
            }
        }
        return counter;

    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Vehicles: [");
        for (int i = 0; i < index ; i++) {
            sb.append(list[i]);
            sb.append(' ');
        }
        sb.append(']');
        return sb.toString();
    }
}
