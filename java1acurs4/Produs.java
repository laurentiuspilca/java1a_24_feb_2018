public class Produs {

    private String nume;
    private double pret;
    private boolean expirat;
    
    public void setNume(String nume) { // mutator
        this.nume = nume;
    }
    
    public String getNume() { // accessor
        return this.nume;
    }
    
    public void setPret(double pret) {
        this.pret = pret;
    }
    
    public double getPret() {
        return this.pret;
    }
    
    public void setExpirat(boolean expirat) {
        this.expirat = expirat;
    }
    
    public boolean isExpirat() {
        return this.expirat;
    }
}