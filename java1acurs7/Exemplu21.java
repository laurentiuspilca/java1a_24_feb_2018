import java.util.*;

public class Exemplu21 {

    public static void main(String [] args) {
        List<Integer> list = new ArrayList();
        list.add(2);
        list.add(1);
        list.add(8);
        list.add(4);
        list.add(5);
        
        Collections.sort(list);
        
        list.forEach(System.out::println);
    }
}