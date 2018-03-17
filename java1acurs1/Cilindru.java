public class Cilindru extends Cerc{
    double inaltime;
    
    Cilindru(){
        super(0);
    }
    
    Cilindru(int x, int y, double raza, double inaltime){
        super(x,y,raza);
        this.inaltime = inaltime;
    }
    
    @Override
    public double calculeazaArie(){
        return 2 * super.calculeazaArie() * inaltime;
    }
}