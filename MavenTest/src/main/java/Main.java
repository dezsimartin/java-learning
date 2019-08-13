import java.io.*;

public class Main {
    public static void main(String[] args) {

        Garage g = new Garage(52, "Rókusi", true, new Car("Feri", 90));
        System.out.println(g);

        try {
            FileOutputStream fs = new FileOutputStream("garage.ser");
            ObjectOutputStream out = new ObjectOutputStream(fs);
            out.writeObject(g);
            out.close();
            fs.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Garage g2;

        try {
            FileInputStream fileIn = new FileInputStream("garage.ser");
            ObjectInputStream oi = new ObjectInputStream(fileIn);
            g2 = (Garage) oi.readObject();
            System.out.println(g2);
            oi.close();
            fileIn.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
