package hu.flowacademy.enums;

public class ATM {
    private String name;
    private long moneyStash;
    private Currency currency;

    public ATM(final long moneyStash, final String name){
        this.moneyStash = moneyStash;
        this.name = name;
    }

    public long getMoney(Card card, long much){
        //@TODO validate
        if(moneyStash - much < 0) {
            throw new RuntimeException(":");
        }
        this.moneyStash -= much;
        System.out.println(this.toString());
        return much;
    }

    enum Currency {
        USD, HUF, EUR;
    }

    @Override
    public String toString() {
        return this.name + " has " + this.moneyStash;
    }
}


class Card {
    String number;
    String exprDate;
    String CVV;
    CardType type;

    public Card(String number, String exprDate, String CVV, CardType type) {
        this.number = number;
        this.exprDate = exprDate;
        this.CVV = CVV;
        this.type = type;
    }

    enum CardType {
        VISA, MASTERCARD, AMEX, DINERS;
    }
}

