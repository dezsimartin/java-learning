package penz;

public class Penz {

    protected int value;
    protected boolean isPaper;


    public Penz(int value, boolean isPaper){
            this.value = value;
            this.isPaper = isPaper;
    }


    public String toString(){
        return value + " FT - " + (isPaper ? "papírpénz" : "aprópénz");
    }
}
