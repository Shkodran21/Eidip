public class Zeichenkette2 {
    public static String wiederhole( int n, String s, char t){
        int a = 1;
        String b = "";
        while( a <= n){
            b += s + t;
            a++;
        }
        return b.substring(0,b.length()-1);
    }
}
