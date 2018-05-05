public class AfisareFilme extends Thread {

    @Override
    public void run() {
        try {
            while (true) {
                int nrFilme = Cinema.getInstance().numaraFilme();
                System.out.println("Numar curent filme: " + nrFilme);
                Thread.sleep(10000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}