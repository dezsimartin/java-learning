package vehicles;

public class Boat extends Vehicle {

    private boolean isOnSea;

    public Boat(String type, int year, boolean isOnSea){
        super(type, year);
        this.isOnSea = isOnSea;
    }

    public void sound(){
        System.out.println("sssssssss hajó vagyok");
    }

    @Override
    public String toString(){
        return super.toString() + ", tengeren vagyok: " + isOnSea;
    }

    public boolean getIsOnSea(){
        return this.isOnSea;
    }

    public void setIsOnSea(boolean isOnSea){
        this.isOnSea = isOnSea;
    }
}
