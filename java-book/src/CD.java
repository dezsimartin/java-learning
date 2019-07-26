public class CD implements Rendelheto {
    private String author;
    private String title;

    public CD(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public void rendel(int db) {
        System.out.println("Rendelni kell " + db + " CD-t az alábbiból: " + this.toString());
    }

    @Override
    public String toString() {
        return author + ": " + title;
    }
}
