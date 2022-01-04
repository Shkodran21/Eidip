public class Zeichenkette2 {
    public static String rückwärts(String s){
        String n = "";
        for(int a = s.length()-1;a != -1;a--){
            n += s.charAt(a);
        }
        return n;
    }
    public static String einfügung (String s,int p,String t){
         String n = "";
         int a = 0;
         while (n.length() < p){
             n += s.charAt(a);
             a++;
         }
         n += t;
         while(n.length() < (s.length() + t.length())){
             n += s.charAt(a);
             a++;
         }
         return n;
    }
}
