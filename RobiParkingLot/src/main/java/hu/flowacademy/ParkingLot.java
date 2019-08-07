package hu.flowacademy;


import hu.flowacademy.Vehicle.Car;
import hu.flowacademy.Vehicle.Motorcycle;
import hu.flowacademy.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ParkingLot<E extends Vehicle> {
    private final List<E> places;
    private int maxPlaces;

    public ParkingLot(int maxPlaces){
        this.maxPlaces = maxPlaces;
        this.places = new ArrayList<>();
    }

    public boolean add(E e){
        if(places.size() == maxPlaces){
            return false;
        }
        return places.add(e);
    }

    public List<E> getPlaces() {
        return places;
    }

    public int getMaxPlaces() {
        return maxPlaces;
    }

    public void setMaxPlaces(int maxPlaces) {
        this.maxPlaces = maxPlaces;
    }

    public E remove(String id){
    Predicate<E> idEquals = v -> v.getID().equals(id);
    E e = places.stream().filter(idEquals).findFirst().orElseThrow(RuntimeException::new);
    places.removeIf(idEquals);
    return e;
    }

    public int getCarCount(){
        return (int) places.stream().filter(o -> o instanceof Car).count();
    }

    public int getMotorCount(){
        return (int) places.stream().filter(o -> o instanceof Motorcycle).count();
    }


}
