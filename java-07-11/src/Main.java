public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        double res = a / b;
        System.out.println(res);            //két egész számnál az eredmény egész
        System.out.println(divide(a,b));    //double-ként kezeli az egész számot, amit kapott paraméterben
    }

    public static double divide(int a, int b){
        double res = (double) a / b;
        return res;
    }
}
