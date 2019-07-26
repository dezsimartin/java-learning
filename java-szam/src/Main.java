import num.Pozitiv;
import num.Szam;

import java.util.List;

public class Main {

    public static void main(String[] args){
        Szam szam = new Szam("123");
        if (szam.getValue() !=  123L){
            System.out.println("mellé");
        }

        Pozitiv p = new Szam("22");
        if(!p.isPozitiv()){
            System.out.println("nem pozitiv");
        }

        List<Pozitiv> pozitivs = List.of(p, new Szam("15"), new Szam("666"));



           System.out.println("siker");

    }
}
