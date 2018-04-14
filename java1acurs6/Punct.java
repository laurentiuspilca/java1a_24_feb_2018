public class Punct {

    int x, y;
    
    public Punct(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString() {
        return x + " " + y;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        
        if (o instanceof Punct) {
            Punct p = (Punct) o;
            return this.x == p.x && this.y == p.y;
        }
        
        return false;
    }
    
    @Override
    public void finalize() {
    }
}