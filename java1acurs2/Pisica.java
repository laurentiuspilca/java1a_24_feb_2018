public class Pisica {

    String culoare;
    int varsta;
    String nume;
    
    Pisica() {
        System.out.println("S-a creat o pisica!");
    }
    
    void spuneMiau() {
        System.out.println("Miau! Numele meu este " + this.nume);
    }
}