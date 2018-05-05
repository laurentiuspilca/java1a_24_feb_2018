public class Resursa implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("Se inchide");
    }
}