public class Exemplu14 {

    public static void main(String [] args) {
        m1();
        m1(3,4,5,7,8,9,1,2,4);
        m1(5,6,8);
        
        int [] x = {4,5,7,3,2};
        m1(x);
    }
    
    static void m1(int... x) {
        for (int i=0; i<x.length; i++) {
            System.out.println(x[i]);
        }
    }
    
    static void m2(int x, int... y) {
    
    }
    
    static void m3(int[]... x) {
    
    }
}