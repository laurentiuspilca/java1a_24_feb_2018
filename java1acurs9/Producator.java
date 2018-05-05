import java.util.*;

public class Producator extends Thread {

    public Producator(String nume) {
        super(nume);
    }

    @Override
    public void run() {
        Random r = new Random();
        
        try {
            while ( true ) {
                synchronized(Exemplu4.list) {
                    if (Exemplu4.list.size() < 100) {
                        int x = r.nextInt(10000);
                        Exemplu4.list.add(x);
                        System.out.println(Thread.currentThread().getName() + " a adaugat pe " + x);
                        Exemplu4.list.notifyAll();
                    } else {
                        Exemplu4.list.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}