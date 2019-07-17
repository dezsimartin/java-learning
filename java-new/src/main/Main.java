package main;

public class Main {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        double res = a / b;
        //   System.out.println(res);                                    //két egész számnál az eredmény egész
//        System.out.println(divide(a,b));                            //double-ként kezeli az egész számot, amit kapott paraméterben
//        System.out.println(strToInt("12"));
        // System.out.println(strToInt("kiscica"));                //exception - futás idejű hiba

       /* for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        int[] arr = new int[10];                                 //Üres tömb, 10 elemnek
        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        } */
        //printArray(args);
        //printThreeDotArray("a", "b", "c", "d");
       /* avgAndSum(args);
        whatArgs(args);

        for (int i = 0; i < 10; i++) {
            System.out.println(fibo(i));
        }*/

        Cat cica = new Cat("Cirmi", 10, 9);
        Cat cica2 = new Cat("Cirmi", 10, 9);

        if (cica.equals(cica2)) {
            System.out.println("UGYANAZ");
        }

//        Animal kutya = new Animal("Bodri", 5, true);
        System.out.println(cica.getName());
        System.out.println(cica.isMammal());
        System.out.println(cica.getAge());
//        System.out.println(kutya.getName());
        cica.sayHello();
        System.out.println(cica);


    }

    public static double divide(int a, int b) {
        double res = (double) a / b;
        return res;
    }

    public static int strToInt(String s) {
        int res = Integer.parseInt(s);      //szövegből egész szám
        double d = Double.parseDouble(s);
        short sh = Short.parseShort(s);
        return res;
    }

    public static void printArray(String[] arr) {
        for (String element : arr) {
            System.out.println(element);
        }
    }

    public static void printThreeDotArray(String... arr) {  // paraméterek átadása tömbként működhet, nem kell definiálni
        for (String element : arr) {
            System.out.print(element + " ");
        }
    }

    public static void avgAndSum(String[] arr) {
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int avg = (a + b) / 2;
        int sum = a + b;
        System.out.println("Átlag: " + avg);
        System.out.println("Összeg: " + sum);
    }

    public static void whatArgs(String[] arr) {
        for (int i = 2; i < arr.length; i++) {
            if (Integer.parseInt(arr[0]) == 0) {
                if (Integer.parseInt(arr[i]) == (Integer.parseInt(arr[i - 1]) + Integer.parseInt(arr[i - 2]))) {
                    if (i == arr.length - 1) {
                        System.out.println("Fibonacci sorozat.");
                    }
                }
            } else if (Integer.parseInt(arr[i]) - Integer.parseInt(arr[i - 1]) == Integer.parseInt(arr[i - 1]) - Integer.parseInt(arr[i - 2])) {
                if (i == arr.length - 1) {
                    System.out.println("Számtani sorozat. Az n értéke: " + (Integer.parseInt(arr[i]) - Integer.parseInt(arr[i - 1])));
                }
            } else if (Integer.parseInt(arr[i]) / Integer.parseInt(arr[i - 1]) == Integer.parseInt(arr[i - 1]) / Integer.parseInt(arr[i - 2])) {
                if (i == arr.length - 1) {
                    System.out.println("Mértani sorozat. Kvóciens: " + (Integer.parseInt(arr[i - 1]) / Integer.parseInt(arr[i - 2])));
                }
            } else {
                System.out.println("Nem sorozat");
            }
        }
    }

    public static int fibo(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibo(n - 1) + fibo(n - 2);
    }
}
