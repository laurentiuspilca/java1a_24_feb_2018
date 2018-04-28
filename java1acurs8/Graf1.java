import java.util.*;

public class Graf1 {

    public static void main(String [] args) {
        List<List<Integer>> graf = new ArrayList<>();
        
        graf.add(new ArrayList<>());
        graf.add(new ArrayList<>());
        graf.add(new ArrayList<>());
        graf.add(new ArrayList<>());
        graf.add(new ArrayList<>());
        
        graf.get(0).add(1);
        graf.get(1).add(4);
        graf.get(3).add(2);
        graf.get(3).add(4);
        graf.get(4).add(0);
        graf.get(4).add(3);
        
        for (int i=0 ;i < graf.size() ;i++) {
            System.out.println(" Se poate ajunge de la " + i + " la " + graf.get(i));
        }
    }
}