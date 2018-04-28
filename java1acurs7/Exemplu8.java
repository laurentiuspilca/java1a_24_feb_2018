public class Exemplu8 {

    public static void main(String [] args) {
        String [] cuv = {"bere", "mere", "ore", "java", "apa", "Albine"};
        
        String a;
        for (int i=0; i<cuv.length-1; i++) {
            for (int j = i + 1; j<cuv.length; j++) {
                if (cuv[i].compareTo(cuv[j]) > 0) {
                    a = cuv[i];
                    cuv[i] = cuv[j];
                    cuv[j] = a;
                }
            }
        }
        
        for (int i =0 ;i<cuv.length; i++) {
            System.out.print(cuv[i] + " ");
        }
    }
}