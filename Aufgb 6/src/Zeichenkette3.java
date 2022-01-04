public class Zeichenkette3 {
    public static String verkürze (String s,int n){
        String a = "";
        String b = "[...]";
        if ( n+n+4 >= s.length()-1){
            return s;
        }
        for ( int c = 0;a.length() < n;c++){
            a += s.charAt(c);
        }
        a += b;
        for (int d = s.length()-n;d < s.length();d++){
            a += s.charAt(d);
        }
        return a;
    }
}
