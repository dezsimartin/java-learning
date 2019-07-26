abstract class Konyv {
    protected String author;
    protected String title;

    public Konyv(){
        author = "Kalapos Pista";
        title = "J";
    }

    public Konyv(String author, String title){
        this.author = author;
        this.title = title;
    }

    public abstract boolean dedikalASzerzo();
}
