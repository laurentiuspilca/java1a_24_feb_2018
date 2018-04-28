public class Produs {

    String nume;
    double pret;
    
    public Produs(String nume) {
        this.nume = nume;
    }
    
    public Produs(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }
    
    @Override
    public String toString() {
        return nume + " " + pret; 
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        
        if (o instanceof Produs) {
            Produs p = (Produs) o;
            return p.nume.equals(this.nume);
        }
        
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.nume.hashCode();
    }
}