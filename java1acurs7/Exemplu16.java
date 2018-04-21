import java.util.*;

public class Exemplu16 {

    public static void main(String [] args) {
        Random r = new Random();
        
        for (int i = 0 ; i < 10 ; i++) {
            int x = r.nextInt(6) + 1;
            int y = r.nextInt(6) + 1;
            
            System.out.print(x + " " + y);
            if (x == y) {
                System.out.println(" dubla");
            } else {
                System.out.println();
            }
        }
    }
}