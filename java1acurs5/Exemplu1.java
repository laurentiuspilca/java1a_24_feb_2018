public class Exemplu1 {

    public static void main(String [] args) {
        Punct p1 = new Punct();
        
        Cerc c1 = new Cerc();
        Punct p2 = new Cerc();
        
        Cilindru cil1 = new Cilindru();
        Cerc c2 = new Cilindru();
        
        Punct p3 = new Cilindru();
        p3.x = 10;
        p3.y = 40;
        
        m2(new Cilindru());
        
        Punct [] v = new Punct[5];
        v[1] = new Cerc();
        v[2] = new Cilindru();
    }
    
    
    private static Punct m1() {
        return new Cerc();
    }
    
    private static void m2 (Punct p) {
    }
}    