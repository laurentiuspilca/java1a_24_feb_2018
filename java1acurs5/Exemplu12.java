public class Exemplu12 {
    
    public static void main(String [] args) {
        Masina m = new Masina();
        Masina.Motor motor = m.new Motor();
        
        System.out.println(m.x);
        motor.ruleaza();
        System.out.println(m.x);
        motor.ruleaza();
        System.out.println(m.x);
        motor.ruleaza();
        System.out.println(m.x);
        motor.ruleaza();
        System.out.println(m.x);
    }
}
