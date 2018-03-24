public class Cilindru extends Cerc {

    double h;
   
    
    public Cilindru(double raza, double h) {
        this.h = h;
        this.raza = raza;
    }
    
    double calculeazaArieBaza() {
        return super.calculeazaArie();
    }
    
    @Override
    protected double calculeazaArie() {
        return 0; // calculeaza aria cilindrului
    }
    
    double calculeazaVolum() {
        return 0; // calculul volumului
    }
}