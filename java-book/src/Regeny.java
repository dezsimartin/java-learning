public class Regeny extends Konyv implements Rendelheto{
    private String summary;

    public Regeny(String author, String title, String summary) {
        super.author = author;
        super.title = title;
        this.summary = summary;
    }

    @Override
    public boolean dedikalASzerzo() {
        return true;
    }

    @Override
    public void rendel(int db) {
        System.out.println("Rendelni kell " + db + " regényt az alábbiból: " + this.toString());
    }

    @Override
    public String toString() {
        return author + ": " + title + " összefoglaló: " + summary;
    }
}
