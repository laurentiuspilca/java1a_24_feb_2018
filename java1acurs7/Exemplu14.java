public class Exemplu14 {

    public static void main(String [] args) {
        String s1 = "HELLO";
        String s2 = "WORLD";
        
        s1.concat(s2);
        
        System.out.println(s1);
        
        StringBuilder s3 = new StringBuilder("HELLO");
        s3.append("WORLD");
        
        System.out.println(s3);
    }
}