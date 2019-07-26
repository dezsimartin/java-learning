

public class Main {

    public static void main(String[] args) {
        SZTEJegyzetbolt.rendelesFelvesz("./fajl.txt");
        System.out.println(SZTEJegyzetbolt.bookStash);
        System.out.println(SZTEJegyzetbolt.cdStash);
        SZTEJegyzetbolt.rendel();
    }

}
