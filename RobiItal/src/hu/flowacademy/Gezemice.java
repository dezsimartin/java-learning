package hu.flowacademy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Gezemice {


    public static void main(String[] args) {
        List<Ital> list = new ArrayList<>();


        beolvas("fajl.tyt");
    }

    public static void beolvas(String path){
        Ital actual;

        try {
            final FileInputStream in = new FileInputStream(path);
            var oi = new ObjectInputStream(in);
            actual = (Ital) oi.readObject();
            System.out.println(actual);
            oi.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
