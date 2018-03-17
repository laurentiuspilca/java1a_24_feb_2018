public class Ex{
    public static void main(String[] args){
        Punct p1 = new Cilindru();
        Punct p2 = new Cerc();
        Cilindru c1;
        
        if(p2 instanceof Cilindru){
            c1 = (Cilindru) p1;
        }else{
            System.out.println("Conversie imposibila");
        }
        
        Animal a1 = new Urs();
        a1.seDeplaseaza();
    }
}