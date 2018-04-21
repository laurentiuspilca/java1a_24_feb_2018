public class Exemplu12 {

    public static void main(String [] args) {
        String str = "mere,pere,si,alte,cele";
        String [] cuv = str.split(",");
        for (int i=0;i<cuv.length;i++) {
            System.out.println(cuv[i]);
        }
    }
}