package hu.flowacademy;

public class PrimeTester implements Runnable {

    private Prime prime;
    private long min;
    private long max;

    public PrimeTester(Prime prime, long min, long max) {
        this.prime = prime;
        this.min = min;
        this.max = max;
    }

    private boolean hasDivider(){
        for (long i = min; i < max; i++) {
            if(this.prime.getNum() % i == 0){
                return true;
            }
        }
        return false;
    }

    @Override
    public void run() {
        if(hasDivider()){
            prime.setPrime();
        }
    }

    public Prime getPrime() {
        return prime;
    }

    public void setPrime(Prime prime) {
        this.prime = prime;
    }

    public long getMin() {
        return min;
    }

    public void setMin(long min) {
        this.min = min;
    }

    public long getMax() {
        return max;
    }

    public void setMax(long max) {
        this.max = max;
    }
}
