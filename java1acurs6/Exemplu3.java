public class Exemplu3 {

    public static void main(String [] args) {
        Predicat p1 = x -> x % 2 == 0;
        Predicat p2 = (x) -> x % 2 == 0;
        Predicat p3 = (int x) -> x % 2 == 0;
        
        Predicat p4 = x -> { 
            return x % 2 == 0; 
        } ;
    }
}