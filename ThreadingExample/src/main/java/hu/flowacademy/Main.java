package hu.flowacademy;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Prime p = new Prime(2542313003L);
        PrimeTester p1 = new PrimeTester(p, 2, p.getNum() / 4);
        PrimeTester p2 = new PrimeTester(p, p.getNum() / 4, p.getNum() / 2);

        PrimeTester p3 = new PrimeTester(p, 2, p.getNum() / 2);

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);


        long start = System.nanoTime();
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        long end = System.nanoTime();

        System.out.println(p);
        System.out.println("eltelt idő: " + (end - start));

        start = System.nanoTime();
        t3.start();

        t3.join();
        end = System.nanoTime();

        System.out.println(p);
        System.out.println("eltelt idő: " + (end - start));
    }

}

