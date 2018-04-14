public class Exemplu12 {

    public static void main(String [] args) {
        
        try (
            Door door1 = new Door("A");
            Door door2 = new Door("B");
        ) {
            // do something with the door
        } catch (Exception e) {
            
        } finally {
            System.out.println("Finally");
        }
    }
}