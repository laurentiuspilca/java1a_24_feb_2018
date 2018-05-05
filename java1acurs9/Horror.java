public class Horror extends Film {

    int varstaMin;
    
    public Horror(String nume, int durata, int varstaMin) {
        this.nume = nume;
        this.durata = durata;
        this.varstaMin = varstaMin;
    }
    
    @Override
    public String toString() {
        return "Horror " + nume + " " + durata + " " + varstaMin;
    }
}