public class Exemplu10 {

    public static void main(String [] args) {
        Punct p1 = new Cerc();
        
        if (p1 instanceof Punct) {
            System.out.println("Este punct!");
        }
        
        if (p1 instanceof Cerc) {
            System.out.println("Este cerc!");
        }
        
        if (p1 instanceof Cilindru) {
            System.out.println("Este cilindru!");
        }
        
        //if (p1 instanceof String) {
            
        //}
    }
}