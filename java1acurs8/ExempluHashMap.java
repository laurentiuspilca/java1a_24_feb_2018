import java.util.*;

public class ExempluHashMap {

    public static void main(String [] args) {
        Map<Integer, String> map = new HashMap<>();
        
        map.put(2, "HELLO");
        map.put(5, "WORLD");
        map.put(5, "JOHN");
        
        Set<Integer> keys = map.keySet();
        for (Integer k : keys) {
            System.out.println(k + " " + map.get(k));
        }
        
        map.forEach( (k,v) -> System.out.println(k + " " + v) );
    }
}