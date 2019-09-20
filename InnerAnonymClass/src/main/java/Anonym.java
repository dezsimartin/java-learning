public class Anonym {

    void show(){
        System.out.println("AnonymShow");
    }


}

class Demo {

    Anonym a = new Anonym(){                                //új ostály az anonym alapján
        void show(){                                        //amiben felülírjuk az eredeti show függvényt
            super.show();
            System.out.println("EZ EGY ÚGY CLASS");
        }
    };

    public void testAnonym() {
        a.show();
    }

}
