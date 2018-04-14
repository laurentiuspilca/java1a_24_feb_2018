public class Exemplu10 {

    public static void main(String [] args) {
        try {
            int x = 10 / 0;
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("Exceptie 1");
        } catch (NullPointerException e) {
            System.out.println("Exceptie 2");
        } catch (Exception e) {
            System.out.println("Exceptie 3");
        } finally {
            System.out.println(":)");
        }
    }
}