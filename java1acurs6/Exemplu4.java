public class Exemplu4 {

    public static void main(String [] args) {
        Producator p1 = () -> 5;
        
        Producator p2 = () -> {
            return 5;
        };
    }
}