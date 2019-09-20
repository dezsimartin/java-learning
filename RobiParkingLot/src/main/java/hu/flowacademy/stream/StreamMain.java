package hu.flowacademy.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    public static final List<String> TO_STREAM = List.of("Return of the jedi", "E.T.", "Ready Player One", "Endgame", "Fight Club", "minimize me", "E.T.");

    public static void main(String[] args) {

       /* Stream<Integer> numbers = Stream.of(1, 3, 5, 7, 9);
        Stream<String> stringStream = Stream.of("Kolbasz", "Szalonna", "Virsli");
        char c = 'c';
        Stream<Character> characterStream = Stream.of('b', 'a', c);
*/
        Integer x = 2;
        Integer y = 6;
        x.toString().replace(x.toString(), y.toString().replace(y.toString(), x.toString()));

        System.out.println("s" + x + "s" + y);
       // 1 stream 1x iterálthat évgig egy objektumon , 1 művelet
        //map -> ugyanannyi elem
        //flat map-> különbözö elem, lista merge pl, nullok kiszürése.

      /*  System.out.println(TO_STREAM.stream().allMatch(s -> s.contains("\\.")));                //allmatch - mindegyikben megegyezik
        System.out.println(TO_STREAM.stream().anyMatch(s -> s.equals(s.toLowerCase())));        //any match- minimize me
        System.out.println(TO_STREAM.stream().allMatch(StreamMain::isBlank));                   //s -> !s.isBlank()  - method reference
        System.out.println(TO_STREAM.stream().distinct().collect(Collectors.joining(",")));           //szűr értéket, ha többször van. toStringisit kb (delimiter a tagoló)
        System.out.println(TO_STREAM.stream().peek(s -> s += " 2").collect(Collectors.joining("\t|\t")));  */     //nem változtatható a string immutable miatt.
     /*   var problem = TO_STREAM.stream();
        problem.forEach(System.out::println);*/

    }

    public static boolean isBlank(String s){
        return s != null && s.trim().isEmpty();
    }
}
