import java.util.Scanner;
public class Eingabe2 {
    public static double durschnitt(Scanner sc){
        double durschnitt = 0.0;
        int anzahl = 0;
        while ( sc.hasNext()){
            durschnitt += sc.nextInt();
            anzahl++;
        }
        return durschnitt/anzahl;
    }
}
