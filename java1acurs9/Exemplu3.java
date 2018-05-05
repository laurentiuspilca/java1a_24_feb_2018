public class Exemplu3 {

    public static void main(String [] args) {
        EvenNumbersThread t1 = new EvenNumbersThread();
        
        OddNumbersRunnable r = new OddNumbersRunnable();
        Thread t2 = new Thread(r);
        
        t1.start();
        t2.start();
        
        
    }
}