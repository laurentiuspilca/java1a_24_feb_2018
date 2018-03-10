public class Exemplu1 {

    public static void main(String [] args) {
        /*
         * int, char, String, enum
         */
        int zi = 1;
        
        switch (zi) {
            case 1:
                System.out.println("Luni");
                break;
            case 4:
                System.out.println("Joi");
                break;
            case 6:
            case 7:
                System.out.println("Weekend!");
                break;
            default:    
                System.out.println("Eroare!");
        }
    }
}