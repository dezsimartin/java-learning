import java.util.List;

public class Restaurant {

    private String name;

    private Long seats;

    private List<String> menu;

    private Long workers;

    private boolean WC;

    public Restaurant() {
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", seats=" + seats +
                ", menu=" + menu +
                ", workers=" + workers +
                ", WC=" + WC +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSeats() {
        return seats;
    }

    public void setSeats(Long seats) {
        this.seats = seats;
    }

    public List<String> getMenu() {
        return menu;
    }

    public void setMenu(List<String> menu) {
        this.menu = menu;
    }

    public Long getWorkers() {
        return workers;
    }

    public void setWorkers(Long workers) {
        this.workers = workers;
    }

    public boolean isWC() {
        return WC;
    }

    public void setWC(boolean WC) {
        this.WC = WC;
    }
}
