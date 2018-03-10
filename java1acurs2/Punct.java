public class Punct {

    double x,y;
    
    Punct(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    
    double calculeazaDistanta(Punct p) {
        double d = Math.sqrt( (this.x - p.x)*(this.x - p.x) + (this.y - p.y)*(this.y - p.y) );
        return d;
    }
    
    double calculeazaDistanta2(Punct p) {
        return p.calculeazaDistanta(this);
    }
}