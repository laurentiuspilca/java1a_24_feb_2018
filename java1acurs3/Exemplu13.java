public class Exemplu13 {

    public static void main(String [] args) {
        int [] a1,a2,a3; // vectori
        int b1[], b2,b3; // b1 - vector, b2,b3 int
        int [] c1[], c2,c3; // c1 - matrice, c2,c3 - vectori
        
        
        
        int [] x = new int[5];
        int [] y = {4,5,6,7,8,2};
        int [] z = new int[]{3,5,6,8,9};
        
        int [][] w = {{}, {1, 5, 6}, {5} ,null, x, new int[]{3,5,6,8,9}};
        
        System.out.println(w[0].length); // 0
        System.out.println(w[1].length); // 3
        System.out.println(w[2].length); // 1
        //System.out.println(w[3].length); NullPointerException
        System.out.println(w[4].length); // 5
    }
}