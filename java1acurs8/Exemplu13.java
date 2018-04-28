import java.util.*;
import java.util.stream.*;


public class Exemplu13 {

    public static void main(String [] args) {
        List<String> list = Arrays.asList("abcd", "ccc", "cad", "qwr", "qtyp", "aa");
        
        list.stream()
            .filter(s -> s.contains("a"))
            .map(String::length)
            .sorted(Collections.reverseOrder())
            .forEach(System.out::println);
            
    }
}