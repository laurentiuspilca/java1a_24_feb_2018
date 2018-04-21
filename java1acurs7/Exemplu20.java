import java.util.Scanner;

public class Exemplu20 {

    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        
        while (true) {
            
            System.out.print("Comanda: ");
            String cmd = s.nextLine();
            
            String [] cuv = cmd.split("\\s+");
            
            switch (cuv[0]) {
                case "exit":
                    System.out.println("Aplicatia se inchide...");
                    return;
                
                case "suma": {
                    int a = Integer.parseInt(cuv[1]);
                    int b = Integer.parseInt(cuv[2]);
                    System.out.println("Suma este " + (a + b));
                } break;
                    
                case "produs": {
                    int a = Integer.parseInt(cuv[1]);
                    int b = Integer.parseInt(cuv[2]);
                    System.out.println("Produsul este " + (a * b));
                } break;
                
                default:
                    System.out.println("Aceasta comanda nu este corecta!");
            }
        }
    }
}