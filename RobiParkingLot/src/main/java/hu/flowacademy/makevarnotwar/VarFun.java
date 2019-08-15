package hu.flowacademy.makevarnotwar;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VarFun {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<Integer>();          //java 5, mindkét oldalra ki kell írni
        List<Integer> integerList = new ArrayList<>();              //java 7, diamond, a bal oldalról tudja
        var list = new ArrayList<Integer>();                        //java 11, jobbról írjuk meg

        var o = new Object();

        var string = "asd";



        var f = new Feri() {   //anonim osztály, var miatt használható az interfaceben nem feltüntetett method is, ( Ha feriként deklaráljuk, nem hívható meg a drink water)

            @Override
            public void drinkBeer() {
                System.out.println("I love beer!");
            }

            public void drinkWater(){
                throw new RuntimeException();
            }
        };

        f.drinkBeer();
        f.drinkWater();         // ha var-ral deklaráljuk

        var feri = Optional.of(new Feri() {
            @Override
            public void drinkBeer() {

            }

            public String drinkWater() {
                return "I HATE";
            }
        }).map(f1 -> f1.drinkWater())
                .orElse(null);
    }

    //osztály, csak egyszer jön létre (egy példány), mindig ugyanazt a példányt adja vissza
    //static fordulási időben létrejön.


    interface Feri {
        void drinkBeer();
    }

}
