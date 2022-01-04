/**
 * @author sfaniq2s
 */
public class Zeichenkette {
    public static boolean istPalindromLoop(String n){
        String n2 = "";
        for(int i = 0;i < n.length();i++){
            if(Character.isLetterOrDigit(n.charAt(i))) {
                n2 += Character.toLowerCase(n.charAt(i));
            }
        }
        int s = 0;
        int ss = n2.length()-1;
        while(s <= ss){
            if(n2.charAt(s) == n2.charAt(ss)){
            }else{
                return false;
            }
            s++;
            ss--;
        }
        return true;
    }
    public static boolean istPalindromRek(String n){

        if(n.length() == 0 | n.length() == 1){
            return true;
        }
        if(Character.toLowerCase(n.charAt(0)) == Character.toLowerCase(n.charAt(n.length()-1))){
            return istPalindromRek(n.substring(1,n.length()-1));
        }else{
            return false;
        }
    }
}