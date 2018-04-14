@FunctionalInterface
public interface Producator {
    public int get();
    
    default void m() {
    }
}