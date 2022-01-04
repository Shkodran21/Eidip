public class Zeichenkette {
    public static int anzahlBuchstaben(String s){
        int b = 0;
        for(int a = 0; a < s.length(); a++){
            if ( Character.isLetter(s.charAt(a))){
                b++;
            }
        }
        return b;
    }
    public static boolean istZiffernfolge ( String s){
        for(int a = 0; a < s.length(); a++){
            if( Character.isDigit(s.charAt(a))){
            }else{
                return false;
            }
        }
        return true;
    }
    public static boolean istName( String s){
        for( int a = 0; a < s.length();a++){
            if ( Character.isLetter(s.charAt(a)) | s.charAt(a) == '-'){
            }else{
                return false;
            }
        }
        if ( s.charAt(0) == '-' | s.charAt(s.length()-1) == '-') {
            return false;
        }else{
            return true;
        }
    }
    public static String vokaleGross (String s){
        String n = "";
        for(int a = 0;a < s.length();a++){
            if(s.charAt(a) == 'a' | s.charAt(a) == 'e' | s.charAt(a) == 'i' | s.charAt(a) == 'o' | s.charAt(a) == 'u' ){
                n += Character.toUpperCase(s.charAt(a));
            }else{
                n += s.charAt(a);
            }
        }
        return n;
    }
}
