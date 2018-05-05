public class Exemplu2 {

    public static void main(String [] args) {
        OddNumbersRunnable r = new OddNumbersRunnable();
        Thread t = new Thread(r);
        t.start();
        System.out.println("The end!");
    }
}