import java.util.*;
import java.util.stream.*;


public class Exemplu12 {

    public static void main(String [] args) {
        List<String> list = Arrays.asList("abcd", "ccc", "cad", "qwr", "qtyp", "aa");
        
        int sum = list.stream()
                      .filter(s -> s.contains("a"))
                      .map(String::length)
                      .reduce(0, (x,y) -> x + y);
                      
        System.out.println(sum);    
        
        
    }
}