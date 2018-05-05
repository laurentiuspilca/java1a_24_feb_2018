public class EvenNumbersThread extends Thread {
    
    @Override
    public void run() {
        for (int i=0; i<=50; i+=2) {
            System.out.println(i + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}