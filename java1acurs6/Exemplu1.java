public class Exemplu1 {

    public static void main(String [] args) {
        Angajat a1 = new Angajat(1000, 4);
        Angajat a2 = new Angajat(1000, 7);
        
        Angajat gigel = new Angajat(1000, 1) {
            
            @Override
            public double calculeazaSalariu() {
                return 5000;
            }
        };
        
        System.out.println(a1.calculeazaSalariu()); // 1000
        System.out.println(a2.calculeazaSalariu()); // 1100
        System.out.println(gigel.calculeazaSalariu()); // 1000 / 5000
    }
}