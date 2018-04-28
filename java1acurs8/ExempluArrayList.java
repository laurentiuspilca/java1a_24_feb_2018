import java.util.*;

public class ExempluArrayList {

    public static void main(String [] args) {
        List<String> list = new ArrayList<>();
        
        list.add("UNU"); // 0
        list.add("DOI"); // 1
        list.add("TREI"); // 2
        list.add("DOI");
        list.add("DOI");
        
        list.remove("DOI");
        list.remove(0);
        
        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        for (String x : list) {
            System.out.println(x);
        }
        
        list.forEach(x -> System.out.println(x));
        
        list.forEach(System.out::println);
    }
}