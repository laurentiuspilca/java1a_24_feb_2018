public class Exemplu9 {

    public static void main(String [] args) {
        int [] v = new int[10];
        
        for (int i=0;i<v.length;i++) {
            v[i] = i*2;
        }
        
        for (int x : v) {
            System.out.println(x);
        }
        
        System.out.println(v);
    }
}