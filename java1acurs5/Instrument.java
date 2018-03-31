public interface Instrument extends Galagios, Cantacios {
    int x = 10;
    public static final int y = 10;
    
    /** public abstract */ void play(); 
    
    default void m1 () {
        System.out.println(":)");
    }
    
    static void m2 () {
        System.out.println(":(");
    }
}