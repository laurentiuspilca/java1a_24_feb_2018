import java.util.*;

public class Exemplu6 {

    public static void main(String [] args) {
        /*
        Comparator<Pisica> c = new Comparator<Pisica>() {
            public int compare(Pisica p1, Pisica p2) {
                return p1.nume.compareTo(p2.nume);
            }
        };
        */
       
        TreeSet<Pisica> set = new TreeSet<>( (p1, p2) -> p1.nume.compareTo(p2.nume) );
        
        set.add(new Pisica("Tom", 4));
        set.add(new Pisica("Kitty", 1));
        set.add(new Pisica("Leo", 3));
        set.add(new Pisica("Mitzy", 2));
        
        set.forEach(p -> System.out.println(p.nume + " " + p.varsta));
    }
}