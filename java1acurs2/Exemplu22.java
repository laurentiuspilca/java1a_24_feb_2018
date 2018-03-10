public class Exemplu22 {

    public static void main(String [] args) {
        Test t = new Test();
        
        int x = 10;
        Punct p1 = new Punct(10, 10); // x = 10
        
        
        
        t.modificaPrimitiva(x);
        t.modificaObiect(p1);
        
        System.out.println(x); // 10
        System.out.println(p1.x); // 50
    }
}