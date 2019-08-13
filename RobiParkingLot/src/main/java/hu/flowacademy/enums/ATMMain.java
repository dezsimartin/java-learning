package hu.flowacademy.enums;

public class ATMMain {

    public static final Card CARD = new Card("4111111111111111", "03/22", "12", Card.CardType.VISA);

    public static void main(String[] args) {
        ATM andy = new ATM(1000, "Andy");
        var m = andy.getMoney(CARD, 200);
        System.out.println(m);
    }

}