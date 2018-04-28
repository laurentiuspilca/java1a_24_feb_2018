import java.util.*;

public class Exemplu7 {

    public static void main(String [] args) {
        Map<Integer, Integer> map = new HashMap<>();
        
        map.put(345, 32);
        map.put(1245, 1);
        map.put(14, 2);
        map.put(11, 45);
        map.put(19, 7);
        map.put(564, 4);
        map.put(74, 9);
        
        map.forEach((k,v) -> System.out.println(k + " " + v));
    }
}