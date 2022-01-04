import java.util.Scanner;
public class Eingabe {
    public static int zählen ( Scanner sc, String s){
        int i = 0;
        while(sc.hasNext()){
            String n = sc.next();
            if( n.equals(s)){
                i++;
            }
        }
        return i;
    }
}
