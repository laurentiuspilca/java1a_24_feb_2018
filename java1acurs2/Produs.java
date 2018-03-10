public class Produs {

    String nume;
    double pret;
    
    Produs(String nume, double pret) {
        System.out.println("Se creaza produsul cu numele " + nume + " si pret " +pret);
        this.nume = nume;
        this.pret = pret;
    }
}