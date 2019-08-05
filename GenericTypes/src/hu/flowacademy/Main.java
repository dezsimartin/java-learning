package hu.flowacademy;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "b");
        HideValue<String> val1 = new HideValue<>("Cica");
        System.out.println(val1);
        HideValue<Integer> num1 = new HideValue<>(200);
        System.out.println(num1);

        Verem<String> l = new Verem<>(10);
        try {
            l.pushValue("ss");
            l.pushValue("geza");
            l.pushValue("ssaasdb");
            l.toString();
            l.popValue();
            System.out.println(l.toString());
        } catch (OverflowExc overflowExc) {
            overflowExc.printStackTrace();
        } catch (UnderflowExc underflowExc){
            underflowExc.printStackTrace();
        }

        l.toString();



    }
}
