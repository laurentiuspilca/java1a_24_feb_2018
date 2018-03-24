public class B extends A {
    int y;
    String x;
    
    public B() {
        super(10);
        System.out.println("B");
        //this.x = "HELLO";
        //super.x = 20;
        //System.out.println(this.x); // 20 / HELLO
    }
    
    public B(int x) {
        super(x);
    }
}