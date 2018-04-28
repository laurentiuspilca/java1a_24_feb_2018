import java.util.*;

public class Exemplu10 {

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
                    
                case "ap" : {
                    String nume = cuv[1];
                    double pret = Double.parseDouble(cuv[2]);
                    Magazin.getInstance().adaugaProdus(new Produs(nume, pret));
                    System.out.println("A fost adaugat produsul " + nume);
                } break;
                
                case "rp" : {
                    String nume = cuv[1];
                    Magazin.getInstance().removeProdus(nume);
                    System.out.println("Produsul " + nume + " a fost sters");
                } break;
                
                case "afisare": Magazin.getInstance().afisareProduse(); break;
                
                default:
                    System.out.println("Comanda incorecta");
            }
        }
    }
}