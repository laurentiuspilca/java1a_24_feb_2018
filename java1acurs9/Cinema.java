import java.util.*;

public class Cinema {
    private static Cinema instance;
    
    private List<Film> filme = new ArrayList<>();
    
    private Cinema() {}

    public static synchronized Cinema getInstance() {
        if (instance == null) {
            instance = new Cinema();
        }
        
        return instance;
    }
    
    public void adaugaFilm(Film f) {
        filme.add(f);
    }
    
    public boolean stergeFilm(String nume) {
        for (int i=0; i<filme.size(); i++) {
            if (filme.get(i).nume.equals(nume)) {
                filme.remove(i);
                return true;
            }
        }
        
        return false;
    }
    
    public void afisareFilme() {
        filme.forEach(f -> System.out.println(f)); // System.out::println
    }
    
    public void afisareHorror() {
        /**
        for (Film f : filme) {
            if (f instanceof Horror) {
                System.out.println(f);
            }
        }
        */
       filme.stream().filter(f -> f instanceof Horror).forEach(System.out::println);
    }
    
    public int numaraFilme() {
        return filme.size();
    }
}