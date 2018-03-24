public class Pizza {

    protected Ingredient [] ingrediente;
    protected double pretBlat;
    
    public double calculeazaPret() {
        double pret = pretBlat;
    
        for (Ingredient i : ingrediente) {
            if (i != null) { 
                pret += i.pret;
            }
        }
        
        return pret;
    }
}