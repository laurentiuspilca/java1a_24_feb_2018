public class Exemplu8 {

    public static void main(String [] args) {
        for (Tip t : Tip.values()) {
            for (Valoare v : Valoare.values()) {
                System.out.println(v + " DE " + t);
            }
        }
    }
}