import java.util.*;

public class Program {
    
    private static Scanner s = new Scanner(System.in);
    
    public static void main(String [] args) {
        
        new AfisareFilme().start();
        
        while (true) {
            
            System.out.print("Comanda:");
            String cmd = s.nextLine();
        
            String [] cuv = cmd.split("\\s+");
            
            switch (cuv[0]) {
                case "exit":
                    System.out.println("Aplicatia se inchide...");
                    System.exit(0);
                    
                case "drama": {
                    String nume = cuv[1];
                    int durata = Integer.parseInt(cuv[2]);
                    
                    Drama d = new Drama(nume, durata);
                    Cinema.getInstance().adaugaFilm(d);
                    System.out.println("A fost adaugat un film drama");
                } break;
                
                case "horror": {
                    String nume = cuv[1];
                    int durata = Integer.parseInt(cuv[2]);
                    int varstaMin = Integer.parseInt(cuv[3]);
                    
                    Horror h = new Horror(nume, durata, varstaMin);
                    Cinema.getInstance().adaugaFilm(h);
                    System.out.println("A fost adaugat un film horror");
                } break;
                
                
                case "afisarefilme" : {
                    Cinema.getInstance().afisareFilme();
                } break;
              
                case "afisarehorror" : {
                    Cinema.getInstance().afisareHorror();
                } break;
                
                case "sterge" : {
                    boolean res = Cinema.getInstance().stergeFilm(cuv[1]);
                    
                    if (res) {
                        System.out.println("A fost sters filmul " + cuv[1]);
                    } else {
                        System.out.println("Filmul " + cuv[1] + " nu exista!");
                    }
                } break;
                
                default:
                    System.out.println("Comanda inexistenta");
            }
        }
        
    }
}