package num;

public class Szam implements Pozitiv, Negativ, Paratlan, Paros {

    private final Long value;

    public Szam(String value) {
        this.value = Long.parseLong(value);
    }

    public Long getValue() {
        return value;
    }


    @Override
    public boolean isNegativ() {
        return this.value < 0;
    }

    @Override
    public boolean isParatlan() {
        return this.value % 2 != 0;
    }

    @Override
    public boolean isParos() {
        return this.value % 2 == 0;
    }

    @Override
    public boolean isPozitiv() {
        return this.value >= 0;
    }
}
