import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class DwarfTest {

    private final static String[] DWAR_NAMES = {"Hapci", "Kuka", "Morgó", "Vidor", "Szundi", "Tudor", "Szende"};

    private static Set<Dwarf> hashSet = new HashSet<>();
    private static Set<Dwarf> treeSet = new TreeSet<>();
    public static List<Dwarf> inputs = new ArrayList<>();

    @BeforeAll
    public static void init(){

        for (int i = 0; i < 1000000; i++) {
            hashSet.add(new Dwarf(getRandomDwarfName()));
            treeSet.add(new Dwarf(getRandomDwarfName()));
            inputs.add(new Dwarf(getRandomDwarfName()));
        }
    }
     @Test
    public void testHashSetPerformance(){
         long start = System.currentTimeMillis();
         System.out.println(new Date(start));

         for (Dwarf d:inputs)
              hashSet.contains(d); {

         }

         System.out.println("End: " + new Date(System.currentTimeMillis() - start));
     }

    private static String getRandomDwarfName() {
         return DWAR_NAMES[new Random().nextInt(DWAR_NAMES.length)];
    }

    @Test
    public void testTreeSetPerformance(){
        long start = System.currentTimeMillis();

    }

}