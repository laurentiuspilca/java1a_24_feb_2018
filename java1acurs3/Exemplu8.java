public class Exemplu8 {

    public static void main(String [] args) {
        final int [] v = new int[5];
        
        v[0] = 10;
        v[1] = 5;
        
        for (int i=0; i<v.length; i++) {
            System.out.println(v[i]);
        }
        
        // for enhanced / foreach
        
        for (int x:v) {
            System.out.println(x);
        }
    }
}