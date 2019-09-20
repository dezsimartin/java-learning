public class Polos {                                //csak egy public lehet egy osztályon belül

    int num = 1;

    private int count(){
        class MethodInner{                          //Method local inner class
            public void sayHello(){
                System.out.println("hello");
            }
        }
        MethodInner mi = new MethodInner();
        mi.sayHello();
        return 100;
    }

    class InnerPolos {                              // Nested Inner Class, láthatóság nélkül protected alapból, adattagként viselkedik az inner class
        int num2;

        public InnerPolos(int num2){
            this.num2 = num2;
            System.out.println(num);        //elérjük a külső osztály adatait
            System.out.println(count());
        }

    }

    public InnerPolos getInner(){
        InnerPolos ip = new InnerPolos(100);
        return ip;
    }

}

class Poloska {

}