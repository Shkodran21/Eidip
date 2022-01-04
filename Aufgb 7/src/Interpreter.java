import java.util.Scanner;
import java.io.PrintStream;
public class Interpreter {
    public static void verarbeiteEingabe (Scanner sc,PrintStream ps){
        while (sc.hasNext()){
            verarbeiteEingabeEinzel(sc,ps);
        }
    }
    public static void verarbeiteEingabeEinzel (Scanner sc,PrintStream ps){
        while(sc.hasNext()){
            String s = sc.next();
            String d = sc.next();
            String in  = sc.next();
            String Z = sc.next();
            char z = d.charAt(0);
            if ( s.contains("vor")){
                verarbeiteEingabeEinzelVor(sc,ps,z,Z);
            }
            if  (s.contains("nach")){
                verarbeiteEingabeEinzelNach(sc,ps,z,Z);
            }else{
                ps.print("");
            }
        }
    }
    public static void verarbeiteEingabeEinzelVor (Scanner sc,PrintStream ps,char zeichen,String Zeichenkette){
        for(int a = Zeichenkette.length()-1;a > 0;a--){
            if(Zeichenkette.charAt(a) == zeichen){
                ps.print(Zeichenkette.substring(0,a));
                a = 0;
            }else{
                ps.print("");
            }
        }
    }
    public static void verarbeiteEingabeEinzelNach (Scanner sc,PrintStream ps,char zeichen,String Zeichenkette){
        for(int a = 0;a < Zeichenkette.length();a++){
            if(Zeichenkette.charAt(a) == zeichen){
                ps.print(Zeichenkette.substring(a+1,Zeichenkette.length()));
                a = Zeichenkette.length();
            }else{
                ps.print("");
            }
        }
    }
}
