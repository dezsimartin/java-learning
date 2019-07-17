public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        double res = a / b;
        System.out.println(res);                                    //két egész számnál az eredmény egész
        System.out.println(divide(a,b));                            //double-ként kezeli az egész számot, amit kapott paraméterben
        System.out.println(strToInt("12"));
       // System.out.println(strToInt("kiscica"));                //exception - futás idejű hiba

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    public static double divide(int a, int b){
        double res = (double) a / b;
        return res;
    }

    public static int strToInt(String s){
        int res = Integer.parseInt(s);      //szövegből egész szám
        double d = Double.parseDouble(s);
        short sh = Short.parseShort(s);
        return res;
    }
}
