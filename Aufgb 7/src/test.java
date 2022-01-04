import java.util.Scanner;
import java.io.PrintStream;
public class test {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        PrintStream ps = new PrintStream(System.out);
        Eingabe.filter(sc,ps,"/*","*/","//");
        sc.close();
    }
}
