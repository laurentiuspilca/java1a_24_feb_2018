public class D {

    final int x = 10;
    final int y;
    final int z;
    final static int w = 10;
    
    {
       y = 10;
    }
    
    D(int z) {
        this.z = z;
    }
    
    void m (final int j) {
        final int k;
        
        k = 10;
        
    }
}