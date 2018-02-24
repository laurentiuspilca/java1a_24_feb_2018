public class Exemplu11 {

    public static void main(String [] args) {
        boolean a = false;
        
        int x = 10;
        int y = 20;
        
        boolean b = x > y & (a = true);
        
        boolean c = !(x > y);
        
        System.out.println(!a);
    }
}