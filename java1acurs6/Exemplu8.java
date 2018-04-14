public class Exemplu8 {

    public static void main(String [] args) throws MyCheckedException {
        doSomething(-10);
    }
    
    private static void doSomething(int x) throws MyCheckedException {
        if( x >= 0 ) {
            System.out.println(x);
            return;
        }
        
        throw new MyCheckedException();
    }
}