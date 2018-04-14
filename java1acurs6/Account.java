public class Account {

    private double amount;
    
    public Account(double amount) {
        this.amount = amount;
    }
    
    public void deposit(double amount) {
        this.amount += amount;
    }
    
    public void withdraw(double amount) throws NotEnoughMoneyException {
        if (this.amount < amount) {
            throw new NotEnoughMoneyException();
        } else {
            this.amount -= amount;
        }
    }
    
    public void displayAmount() {
        System.out.println(this.amount);
    }
}