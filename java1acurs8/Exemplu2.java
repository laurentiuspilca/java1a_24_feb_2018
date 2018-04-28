public class Exemplu2 {

    public static void main(String [] args) {
        A<Integer> a1 = new A<Integer>();
        A<?> a2 = new A<Integer>();
        A<? extends Number> a3 = new A<Integer>();
        A<? super Integer> a4 = new A<Number>();
        A<Integer> a5 = new A<>();
        
        a1.x = 10;
        //a2.x = 10;
        //a3.x = 10;
        a4.x = 10;
        
        A<?> myA = getCeva();
        System.out.println(myA.x);
    }
    
    public static A<?> getCeva() {
        if (true) {
            return new A<String>();
        } else {
            return new A<Integer>();
        }
    }
}