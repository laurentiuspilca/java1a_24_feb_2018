public class Exemplu5 {

    public static void main(String [] args) {
        Functie f1 = (a,b) -> a + b;
        Functie f2 = (int a, int b) -> a + b;
        
        Functie f3 = (a,b) -> {
            return a + b;
        };
        
        
        Functie f4 = new Functie() {
        
            public int calculeaza(int a, int b) {
                return a+b;
            }
        };
        
        
        System.out.println(f1.calculeaza(3,4)); // 7
    }
}