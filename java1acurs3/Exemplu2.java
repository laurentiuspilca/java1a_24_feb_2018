public class Exemplu2 {

    public static void main(String [] args) {
        Punct p = new Punct();
        p.x = 20;
        p.y = 30;
        
        Foo f = new Foo();
        
        f.modificaObiect(p);
        
        System.out.println(p.x); // 100
    }
}