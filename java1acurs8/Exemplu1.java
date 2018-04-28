public class Exemplu1 {

    public static void main(String [] args) {
        A<Integer> a1;
        a1 = new A<Integer>();
        a1.x = 10;
        
        A<String> a2 = new A<String>();
        a2.x = "HELLO";
        
        A a3 = new A();
        a3.x = 10;
        a3.x = "HELLO";
        
        A<int[]> a4 = new A<int[]>();
        a4.x = new int[12];
    }
    
    public static A<Integer> m1() {
        return null;
    }
}