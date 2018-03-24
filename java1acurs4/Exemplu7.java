public class Exemplu7 {

    public static void main(String [] args) {
        Cerc c = new Cerc();
        
        c.centru = new Punct(0,0);
        c.raza = 10;
        
        
        Cilindru cil = new Cilindru(0, 0);
        
        cil.centru = new Punct(0,0);
        cil.raza = 10;
        cil.h = 20;
        cil.calculeazaVolum();
    }
}