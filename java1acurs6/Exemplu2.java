public class Exemplu2 {

    public static void main(String [] args) {
        Predicat p1 = new Predicat() { // interfata functionala
            
            public boolean test(int x) {
                return x % 2 == 0;
            }
        };
        
        System.out.println(p1.test(4)); // true
        System.out.println(p1.test(5)); // false
        
        Predicat p2 = x -> x % 2 == 0;
        
        System.out.println(p2.test(4)); // true
        System.out.println(p2.test(5)); // false
    }
}