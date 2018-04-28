import java.util.*;

public class Magazin {
    private static Magazin instance;
    
    private Set<Produs> produse;
    
    private Magazin() {
        produse = new LinkedHashSet<>();
    }
    
    public static Magazin getInstance() {
        if (instance == null) {
            instance = new Magazin();
        }
        
        return instance;
    }
    
    public void adaugaProdus(Produs p) {
        this.produse.add(p);
    }
    
    public void removeProdus(String nume) {
        this.produse.remove(new Produs(nume));
    }
    
    public void afisareProduse() {
        this.produse.forEach(System.out::println);
    }
}