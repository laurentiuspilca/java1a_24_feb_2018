public class NotEnoughMoneyException extends Exception {
    
    public NotEnoughMoneyException() {
        super("This account does not have enough money");
    }
}