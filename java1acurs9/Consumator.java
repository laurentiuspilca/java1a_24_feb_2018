public class Consumator extends Thread {

    public Consumator(String nume) {
        super(nume);
    }
    
    @Override
    public void run() {
        try {
            while ( true ) {
                synchronized(Exemplu4.list) {
                    if (!Exemplu4.list.isEmpty()) {
                        int x = Exemplu4.list.get(0);
                        Exemplu4.list.remove(0);
                        System.out.println(Thread.currentThread().getName() + " a consumat pe " + x);
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