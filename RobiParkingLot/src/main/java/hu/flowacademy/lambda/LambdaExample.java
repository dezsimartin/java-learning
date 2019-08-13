package hu.flowacademy.lambda;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExample {

    public static void main(String[] args) {
        Supplier<Integer> supp = () -> 3 * 2;       //  () -> 3 (ugyanaz)  , function interface az alapja (predicate, supplier, consumer)
        Consumer<Integer> when = (a) -> System.out.println(a+2);
        Consumer<Integer> after = (a) -> System.out.println(a*5);

        Predicate<Boolean> not = (a) -> !a;


        supp.get();
       // when.accept(3);
        not.test(true);
        when.andThen(after).accept(3);

    }


}
