import butorgyar.*;

public class Main {

    public static void main(String[] args) {
        Butorlap polc = new Butorlap(250, 250, true);
        Butorlap kalitka = new Butorlap(600, 530, false);

        System.out.println(polc.arSzamol());
        System.out.println(kalitka.arSzamol());

        Butor konyhaszekreny = new Butor();

        konyhaszekreny.lapHozzaad(polc);
        konyhaszekreny.lapHozzaad(kalitka);
        System.out.println(konyhaszekreny.toString());


        double sum = konyhaszekreny.arSzamol();
        System.out.println(sum);
    }
}
