public class Poligon {

    private final Punct [] puncte;
    
    public Poligon(Punct [] puncte) {
        this.puncte = copyPuncte(puncte);
    }
    
    public Punct [] getPuncte() {
        return copyPuncte(this.puncte);
    }
    
    private static Punct[] copyPuncte(Punct [] puncte) {
        Punct [] copie = new Punct[puncte.length];
        
        for (int i=0; i<copie.length; i++) {
            copie[i] = puncte[i];
        }
        
        return copie;
    }
}