public class Exemplu6 {

    public static void main(String [] args) {
        String s1 = "HELLO WORLD!";
        String s2 = new String("HELLO WORLD!");
        
        for (int i=0; i< 1000; i++) {
            s1 += s2;
        }
        
    }
}