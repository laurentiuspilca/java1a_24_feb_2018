public class Exemplu1 {

    public static void main(String [] args) {
        MySingleton s1 = MySingleton.getInstance();
        MySingleton s2 = MySingleton.getInstance();
        
        System.out.println(s1);
        System.out.println(s2);
    }
}