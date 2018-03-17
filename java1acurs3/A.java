public class A {

    int x;
    
    A() {
        System.out.println("CONSTRUCTOR");
    }
    
    {
        System.out.println("Bloc anonim 1");
    }
    
    {
        System.out.println("Bloc anonim 2");
    }
    
    static {
        System.out.println("Bloc anonim static 1");
    }
    
    static void m1() {
        System.out.println("m1");
    }
}