public class Comanda {

    Pizza [] pizza = new Pizza[100];
    
    public double calculeazaPretTotal() {
        int pret = 0;
        
        for (Pizza p : pizza) {
            if (p != null) {
                pret += p.calculeazaPret();
            }
        }
        
        return pret;
    }
}