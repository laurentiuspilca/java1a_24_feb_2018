public class Cerc extends Punct{
    double raza;
    Cerc(){
        super(0,0);
        this.raza = 0;
    }
    
    Cerc(double r){
        this();
        this.raza = r;
    }
    
    Cerc(int x, int y, double raza){
        super(0,0);
        super.x = x;
        super.y = y;
        this.raza = raza;
    }
    
    public double calculeazaArie(){
        return 2 * 3.14 * this.raza;
    }
}