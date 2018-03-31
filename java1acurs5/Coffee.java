public enum Coffee {
    SMALL(50), MEDIUM(80), LARGE(150);
    
    private int qty;
    
    private Coffee() {
    }
    
    private Coffee(int qty) {
        this.qty = qty;
    }
    
    public void fillCoffee() {
        this.qty++;
    }
    
    public void drinkCoffee() {
        this.qty--;
    }
}