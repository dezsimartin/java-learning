package vehicles;

public abstract class Vehicle {
    private String type;
    private int year;

    public Vehicle(){
        this.type = "";
        this.year = 2000;
    }
    public Vehicle(String type, int year){
        this.type = type;
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year >= 1800 && year < 2020) {
            this.year = year;
        }
    }

    public String toString() {
        return "A jármű típusa: " + type + ", évjárata: " + year;
    }

    public abstract void sound();


}
