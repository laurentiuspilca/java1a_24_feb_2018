import java.util.*;
import java.util.stream.*;

public class Exemplu11 {

    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(3,6,8,9,2,4,6,8,2,4,6,8,9);
        
        
        int suma = 0;
        
        /*
        for (Integer x : list) {
            if (x % 2 == 0) {
                suma += x;
            }
        }*/
        
        suma = list.stream()
                   .filter(x -> x % 2 == 0)
                   .reduce(0, (a,b) -> a+b);
        
        System.out.println(suma);
    }
}