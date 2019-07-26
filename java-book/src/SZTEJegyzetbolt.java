import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class SZTEJegyzetbolt {

    public static ArrayList<CD> cdStash = new ArrayList<CD>();
    public static ArrayList<Konyv> bookStash = new ArrayList<Konyv>();

    public static void rendelesFelvesz(String path) {
        String[] array;
        try (FileReader reader = new FileReader(path);
             BufferedReader br = new BufferedReader(reader)) {

            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                array = line.split(";");
                for (int j = 0; j < array.length; j++) {
                    if (array[j].equals("cd")) {
                        cdStash.add(new CD(array[j+1], array[j+2]));
                    } else if (array[j].equals("peldatar")) {
                        bookStash.add(new Peldatar(array[j+1], array[j+2], Integer.parseInt(array[j+3])));
                    } else if (array[j].equals("regeny")) {
                        bookStash.add(new Regeny(array[j+1], array[j+2], array[j+3]));
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.err.format("FileNotFoundException: %s%n", e);
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }

    public static void rendel(){
        for (int i = 0; i < cdStash.size(); i++) {
            cdStash.get(i).rendel(1);
        }
        for (int i = 0; i < bookStash.size(); i++) {
            if(bookStash.get(i) instanceof Regeny)
                ((Regeny) bookStash.get(i)).rendel(1);
        }
    }
}
