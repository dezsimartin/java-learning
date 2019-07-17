package butorgyar;

public class Butorlap {
    protected double length;
    protected double width;
    protected boolean isBackside;
    protected final double backsidePrice = 500;
    protected final double holderPrice = 5000;

    public Butorlap(double length, double width, boolean isBackside){
        this.length = length / 100;
        this.width = width / 100;
        this.isBackside = isBackside;
    }

    public double arSzamol(){
    return (width * length) * (isBackside ? backsidePrice : holderPrice);
    }
}
