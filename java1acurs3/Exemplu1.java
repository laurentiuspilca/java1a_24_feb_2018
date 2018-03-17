public class Exemplu1 {

    public static void main(String [] args) {
        Foo f = new Foo();
        
        int x = 10;
        f.modificaPrimitiva(x);
        
        System.out.println(x); // 10
    }
}