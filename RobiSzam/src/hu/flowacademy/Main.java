package hu.flowacademy;

import hu.flowacademy.num.EgeszSzam;
import hu.flowacademy.num.Szam;
import hu.flowacademy.num.TermeszetesSzam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

        public static void main(String[] args){
        TermeszetesSzam sz = new TermeszetesSzam("2");
        Szam L = new EgeszSzam("5");
        List<String> stringList = new ArrayList<>();
        stringList.add("cica");
        stringList.add("kiscicaaaaaaaaaaaaaaaaa");
        stringList.add("oroszldsgsdhdgdhfddán");
        stringList.add("tigris");
        stringList.add("kiscica");
            List<String> b = new ArrayList<>();

           b = getLongNames(stringList);
           b.forEach(System.out::println);
        }




    public static List<String> getLongNames(List<String> stringList){

        return stringList;
    }
}
