public class Masina {

    String marca;
    String culoare;
    
    public Masina(String marca) {
        this.marca = marca;
    }
    
    public Masina(String marca, String culoare) {
        this(marca); // prima instructiune
        this.culoare = culoare;
    }
}