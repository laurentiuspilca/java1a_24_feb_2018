public class Exemplu12 {

    public static void main(String [] args) {
        int [][] x = new int[5][3];
        
        int c = 1;
        
        for (int i=0;i<x.length;i++) {
            for (int j=0; j<x[i].length; j++) {
                x[i][j] = c;
                c++;
            }
        }
        
        for (int [] i : x) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        for (int i=0;i<x.length;i++) {
            for (int j=0; j<x[i].length; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }
}