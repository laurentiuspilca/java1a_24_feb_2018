public class Exemplu1 {

    public static void main(String [] args) {
        EvenNumbersThread t = new EvenNumbersThread();
        t.start();
        System.out.println("THE END! " + Thread.currentThread().getName());
    }
}