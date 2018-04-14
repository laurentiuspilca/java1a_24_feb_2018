public class Exemplu9 {

    public static void main(String [] args) {
        try {
            int x = 10 / 0; // ArithmeticException
            System.out.println(x);
        } finally {
            System.out.println("Finally");
        }
    }
}