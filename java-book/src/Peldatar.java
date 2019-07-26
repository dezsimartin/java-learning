public class Peldatar extends Konyv {
    private int exercises;

    public Peldatar(String author, String title, int exercises) {
        super.author = author;
        super.title = title;
        this.exercises = exercises;
    }

    @Override
    public boolean dedikalASzerzo() {
        return false;
    }

    @Override
    public String toString() {
        return author + ": " + title + " feladatok: " + exercises;
    }
}
