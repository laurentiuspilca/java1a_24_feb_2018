public class Exemplu7 {

    public static void main(String [] args) {
        Anotimp a = Anotimp.VARA;
        
        switch (a) {
            case VARA : System.out.println("Este cald!"); break;
        }
        
        for (Anotimp x : Anotimp.values()) {
            System.out.println(x);
        }
        
        System.out.println(a.name() + " " + a.ordinal());
    }
}