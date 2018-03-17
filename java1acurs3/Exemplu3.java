public class Exemplu3 {

    public static void main(String [] args) {
        Punct p1 = new Punct();
        Punct p2 = new Punct();
        
        p1.x = 10;
        p2.x = 20;
        
        Punct.z = 30;
        p1.z = 10;
        p2.z = 20;
        
        System.out.println(p1.x); // 10
        System.out.println(p2.x); // 20
        
        System.out.println(p1.z); // 20
        System.out.println(p2.z); // 20
    }
    
}