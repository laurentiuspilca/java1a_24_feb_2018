import java.util.Scanner;

public class Exemplu18 {

    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Scrie: ");
        String line = s.nextLine();
        StringBuilder sb = new StringBuilder(line);
        System.out.println("Inversat: " + sb.reverse());
    }
}