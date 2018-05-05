public class Drama extends Film {
    
    public Drama(String nume, int durata) {
        this.nume = nume;
        this.durata = durata;
    }
    
    @Override
    public String toString() {
        return "Drama " + nume + " " + durata;
    }
}