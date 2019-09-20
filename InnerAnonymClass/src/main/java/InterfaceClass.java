public class InterfaceClass {

    public void createNyavog(){
        Nyavog ny = new Nyavog() {                  //anonymus class, meny implementálja az interfacet
            @Override
            public void nyav() {
                System.out.println("meow");
            }
        };
        ny.nyav();
    }
}


interface Nyavog {
    void nyav();
}
