package hu.flowacademy;

public class Prime {
    private long num;
    private boolean isPrime = true;

    public Prime(long num) {
        this.num = num;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public boolean isPrime() {
        return isPrime;
    }

    public void setPrime() {
        isPrime = !isPrime;
    }

    @Override
    public String toString() {
        return "Prime{" +
                "num=" + num +
                ", isPrime=" + isPrime +
                '}';
    }
}
