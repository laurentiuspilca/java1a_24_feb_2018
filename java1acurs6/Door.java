public class Door implements AutoCloseable {
    
    private String text;
    
    public Door(String text) {
        this.text = text;
    }
    
    @Override
    public void close() {
        System.out.println("Door closed " + text);
    }
        
}