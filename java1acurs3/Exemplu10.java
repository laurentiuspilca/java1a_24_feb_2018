public class Exemplu10 {

    public static void main(String [] args) {
        Punct [] p = new Punct[5];
        
        p[0] = new Punct();
        p[0].x = 10;
        
        for (Punct x : p) {
            System.out.println(x);
        }
        
        System.out.print(p);
    }
}