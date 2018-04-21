import java.util.*;

public class Exemplu19 {

    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("X:");
        int x = s.nextInt();
        // int x = Integer.parseInt(s.nextLine());
        System.out.print("Y:");
        int y = s.nextInt();
        
        System.out.println("SUMA: " + (x + y));
    }
}