public class E1 {

    public void m1() {
        class E2 {
        
            public void m2() {
            }
        }
    }
    
    public static void m3() {
        int x = 10;
        
        class E3 {
            public void m4() {
                //System.out.println(x);
            }
        }
        
        x = 20;
    }
}