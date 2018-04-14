public class Angajat {

    double salariu;
    int vechime;
    
    public Angajat(double salariu, int vechime) {
        this.salariu = salariu;
        this.vechime = vechime;
    }
    
    public double calculeazaSalariu() {
        if (vechime < 5) {
            return salariu;
        }
        
        return salariu + 100;
    }
}