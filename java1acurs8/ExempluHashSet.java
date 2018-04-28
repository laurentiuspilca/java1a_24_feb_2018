import java.util.*;

public class ExempluHashSet {

    public static void main(String [] args) {
        HashSet<Integer> set = new HashSet<>();
        
        set.add(1234);
        set.add(15);
        set.add(9568);
        set.add(85);
        set.add(87);
        set.add(15);
        set.add(174);
        
        set.forEach(x -> System.out.println(x));
    }
}