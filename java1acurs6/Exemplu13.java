public class Exemplu13 {

    public static void main(String [] args) {
        Account a = new Account(1000);
        
        try {
            a.withdraw(1500);
            a.displayAmount();
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        }
    }
}