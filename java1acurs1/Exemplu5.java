public class Exemplu5 {

    public static void main (String [] args) {
        
        String s1 = "HELLO";
        String s2 = "HELLO \u1111 WORLD";
        String s3 = "HELLO \n WORLD";
        
        String s4 = "HELLO \\n WORLD";
        
        System.out.print(s4);
    }
}