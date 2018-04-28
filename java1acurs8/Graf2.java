import java.util.*;

public class Graf2 {

    public static void main(String [] args) {
        Map<String, Map<String, Integer>> graf = new HashMap<>();
        
        graf.put("BUC", new HashMap<>());
        graf.put("PARIS", new HashMap<>());
        graf.put("LONDRA", new HashMap<>());
        graf.put("SOFIA", new HashMap<>());
        graf.put("PRAGA", new HashMap<>());
        
        graf.get("BUC").put("PRAGA", 2);
    }
}