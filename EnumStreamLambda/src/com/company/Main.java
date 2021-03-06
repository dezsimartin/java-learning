package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    enum Planet {                                                                //konstans értékeket tárolnak
        MARS(3402.5, 6.41E+23),                                     //értékek, amelyek meghivják az enum konstruktorát.
        EARTH(6378.137, 5.97E+24),
        JUPITER(71492, 1.9E+27);

        private final double radius;
        private final double mass;

        Planet(double radius, double mass){
            this.radius = radius;
            this.mass = mass;
        }

        public double getRadius(){ return radius; }
        public double getMass() { return mass; }
    }

    public static void main(String[] args) {

        Planet p = Planet.EARTH;
        System.out.println(p.getMass());
        if (p == Planet.EARTH){
            System.out.println("zacsi");
        }


        List<String> nameList = Arrays.asList("Feri", "Robi", "Máté1", "fMáté2");
        nameList.stream().sorted().limit(2).forEach(System.out::println);
        List<String> newNameList =  nameList.stream().sorted().limit(2).collect(Collectors.toList());
        System.out.println(newNameList);
        newNameList.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
        nameList.stream().map(s -> s.length()).sorted(Comparator.reverseOrder()).limit(1).forEach(System.out::println);
        nameList.stream().filter(s -> s.charAt(0) == 'F' || s.charAt(0) == 'f').forEach(item -> {System.out.println(item + " ");});   //lambda expression item -> {System.out.println(item + " ");}

        System.out.println(newCSV("kiscica.csv"));

    }

    public static List<Kiscica> newCSV(String path){
        List<Kiscica> list;
        try{
           /* Files.lines(Paths.get(path)).forEach(item -> {
                System.out.println(item);
            });*/
          list =  Files.lines(Paths.get(path)).map(s -> {
                String[] arr = s.split(";");
                return new Kiscica(arr[0], Integer.parseInt(arr[1]));
            }).collect(Collectors.toList());
          return list;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void readOldCSV(String path){
        try{
            // Files.lines(Path.get(path))
            BufferedReader br = new BufferedReader(new FileReader(new File(path)));
            String s = br.readLine();
            while(s != null) {
                System.out.println(s);
                s = br.readLine();
            }

        }  catch (IOException e){
            e.printStackTrace();
        }
    }





}
