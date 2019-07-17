package penz;

import java.util.Arrays;

public class Penztarca {

    private Penz[] penztarca;
    private int penzdb;

    public Penztarca(){
        penzdb = 0;
        penztarca = new Penz[100];
    }

    public void penzBetesz(Penz penz){
        if(penztarca[penzdb] == null){
            penztarca[penzdb++] = penz;
        }
    }

    public int penzSzamol(int value){
        int sum = 0;
        for (int i = 0; i < penzdb; i++) {
                if (penztarca[i].value == value) {
                    sum += 10;
                } else if (penztarca[i].value == value) {
                    sum += 100;
                } else if (penztarca[i].value == value){
                    sum += 1000;
                }
            }

        return sum;
    }

    public int penzSzamol(boolean isPaper){
        int count = 0;
        for (int i = 0; i < penzdb; i++) {
            if(penztarca[i].isPaper == isPaper) {
            count++;
            }
        }
        return count;
    }
}
