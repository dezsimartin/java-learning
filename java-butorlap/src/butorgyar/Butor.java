package butorgyar;

public class Butor {
    protected int blockboard;
    protected Butorlap[] butorStash;

    public Butor(){
        this.butorStash = new Butorlap [100];
        this.blockboard = 0;
    }

    public void lapHozzaad(Butorlap butorlap) {
        for (int i = 0; i < butorStash.length; i++) {
            if(butorStash[i] == null){
                butorStash[i] = butorlap;
                this.blockboard++;
                break;
            }
        }
    }

    public void getStash(){
        for (int i = 0; i < butorStash.length; i++) {
            System.out.println(butorStash[i].length);
        }
    }

    public double arSzamol(){
        double sum = 0;
        for (int i = 0; i < butorStash.length; i++) {
            if(butorStash[i] == null){
                break;
            } else {
                if (butorStash[i].isBackside == true && butorStash[i] != null) {
                    sum = sum + (butorStash[i].width * butorStash[i].length) * butorStash[i].backsidePrice;
                } else {
                    sum = sum + (butorStash[i].width * butorStash[i].length) * butorStash[i].holderPrice;
                }
            }

        }
        return sum;
    }

    public String toString() {
        return "Butor - lapok: " + this.blockboard + ", ár: "+ arSzamol();
    }
}
