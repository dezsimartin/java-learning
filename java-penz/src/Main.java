import penz.*;
public class Main {

    public static void main(String[] args) {
        Penztarca wallet = new Penztarca();
        Penz penz1 = new Penz(1000, true);
        Penz penz2 = new Penz(100, false);
        Penz penz3 = new Penz(10, true);

        wallet.penzBetesz(penz1);
        wallet.penzBetesz(penz2);
        wallet.penzBetesz(penz3);
        int a = wallet.penzSzamol(1000);
        System.out.println(a);
        int b = wallet.penzSzamol(true);
        System.out.println(b);
    }
}
