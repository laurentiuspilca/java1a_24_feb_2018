public class Exemplu10 {

    public static void main(String [] args) {
        String cuv[] = {"ana", "are", "mere"};
        //String s = "ana are mere";
        String v = "aeiou";
        
        int nr = 0;
        
        for (String s : cuv) {
            for (int i=0;i<s.length();i++) {
                if (v.contains(s.charAt(i) + "")) {
                    nr++;
                }
            }
        }
        
        System.out.println(nr);
    }
}