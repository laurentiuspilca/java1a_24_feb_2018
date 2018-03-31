public class Exemplu6 {

    public static void main(String [] args) {
        Persoana p = new Persoana();
        
        Sandwich b = new Sandwich();
        Cola c = new Cola();
        
        p.eat(b);
        p.eat(c);
    }
}