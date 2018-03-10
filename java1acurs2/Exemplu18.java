public class Exemplu18 {

    public static void main(String [] args) {
        Pisica p1;
        p1 = new Pisica();
        
        Pisica p2 = new Pisica();
        
        p1.nume = "Tom";
        p1.varsta = 4;
        
        p2.nume = "Leo";
        p2.varsta = 3;
        
        System.out.println(p1.nume + " " + p2.nume);
        //System.out.println(p1); // Pisica@43fed23
    }
}