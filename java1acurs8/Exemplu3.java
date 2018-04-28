public class Exemplu3 {

    public static void main(String [] args) {
        
        B<Integer, String > b1 = new B<Integer, String>();
        B<Integer, String > b2 = new B<>();
        B<String, Integer > b3 = new B<String, Integer>();
        B<Integer, Integer> b4 = new B<Integer, Integer>();
        B<?, Integer> b5 = new B<String, Integer>();
        B<? extends Number, ?> b6 = new B<Integer, String>();
        B<? extends Number, ? super Number> b7 = new B<Integer, Object>();
        
    }
}