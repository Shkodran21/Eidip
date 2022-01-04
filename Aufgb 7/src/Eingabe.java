/**
 * @author sfaniq2s
 */
import java.io.PrintStream;
import java.util.Scanner;
public class Eingabe {
    public static void filter(Scanner sc, PrintStream ps,String start,String stop,String skip){
        String s = "";
        String n = "";
        int i = 0;
        while(sc.hasNext()) {
            s = sc.next();
            if (s.equals(start)) {
                while (!s.equals(stop)) {
                    s = sc.next();
                }
                s = "";
            }
            if (s.equals(skip)) {
                sc.nextLine();
                s ="";
            }
            if (!s.equals("")) {
                n += s + " ";
                i++;
            }
        }
        ps.println(n);
        ps.println("Das Ergebnis ist : " + i);
    }
}
