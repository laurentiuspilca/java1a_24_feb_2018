public class Exemplu4 {

    public static void main(String [] args) {
        Punct [] triunghi = new Punct[3];
        triunghi[0] = new Punct(1,8);
        triunghi[1] = new Punct(6,8);
        triunghi[2] = new Punct(3,5);
        
        Poligon p = new Poligon(triunghi);
        
        triunghi[0] = new Punct(7,4);
        
    }
}