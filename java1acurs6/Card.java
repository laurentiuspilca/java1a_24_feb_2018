public class Card {

    private String numar;
    
    public Card (String numar) {
        this.numar = numar;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        
        if (o instanceof Card) {
            Card c = (Card) o;
            return this.numar.equals(c.numar);
        }
        
        return false;
    }
    
    @Override
    public int hashCode() {
        int sum = 0;
        
        for (int i=0 ;i<numar.length(); i++) {
            sum += Integer.parseInt(String.valueOf(numar.charAt(i)));
        }
        
        return sum;
    }
}