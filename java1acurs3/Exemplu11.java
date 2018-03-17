public class Exemplu11 {

    public static void main(String [] args) {
        int [][] x = new int[5][];
        
        x[2] = new int[10];
        
        for (int [] y : x) {
            System.out.println(y);
        }
    }
}