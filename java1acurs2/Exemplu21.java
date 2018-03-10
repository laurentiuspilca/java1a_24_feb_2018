public class Exemplu21 {

    public static void main(String [] args) {
        Punct p1 = new Punct(0, 1);
        Punct p2 = new Punct(1, 0);
        
        double res1 = p1.calculeazaDistanta(p2);
        double res2 = p2.calculeazaDistanta(p1);
        double res3 = p2.calculeazaDistanta(p2);
        double res4 = p2.calculeazaDistanta(new Punct(0,1));
        double res5 = new Punct(0,1).calculeazaDistanta(p1);
        double res6 = new Punct(1,0).calculeazaDistanta(new Punct(0,1));
        
        double res7 = p1.calculeazaDistanta(p2);
        double res8 = p1.calculeazaDistanta2(p2);
        
        System.out.println(res1);
    }
}