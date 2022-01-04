import java.util.Scanner;
public class Messdaten {
    public static double durschnitt (Scanner sc, String g){
        double durschnitt = 0.0;
        int anzahl = 0;
        double max = -Double.MAX_VALUE;
        int maxJahr = 0;
        int maxMonat = 0;
        int maxTag = 0;
        String maxMessung = "";
        while (sc.hasNext()){
            int Jahr = sc.nextInt();
            int Monat = sc.nextInt();
            int Tag = sc.nextInt();
            String Messung = sc.next();
            double Messwert = sc.nextDouble();
            if ( Messung.equals(g)){
                durschnitt += Messwert;
                anzahl++;
            }
            if ( max < Messwert){
                maxJahr = Jahr;
                maxMonat = Monat;
                maxTag = Tag;
                maxMessung = Messung;
                max = Messwert;
            }
        }
        System.out.println("max. " + maxMessung + " (" + max + ") am " + maxTag + "." + maxMonat + "." + maxJahr);
        return durschnitt/anzahl;
    }
}
