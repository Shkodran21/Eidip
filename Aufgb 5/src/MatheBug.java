import java.util.Scanner;
public class MatheBug{
    public static int min ( int a,int b,int c,int d){
        if ( a <= b & a <= c & a <= d){
            return a;
        }if (  b <= a & b <= c & b <= d){
            return b;
        }if (  c <= b & c <= a & c <= d){
            return c;
        }else{
            return d;
        }
    }
    public static int mean ( int a,int b,int c,int d){
        int Mittelwert = (a + b + c + d) / 4 ;
        return Mittelwert;
    }
    public static int nextToMean ( int a,int b,int c,int d){
        int Mittelwert = mean(a,b,c,d);
        a = a - Mittelwert;
        b = b - Mittelwert;
        c = c - Mittelwert;
        d = d - Mittelwert;
        if ( a < 0){
            a = a * -1;
        }if ( b < 0){
            b = b * -1;
        }if ( c < 0){
            c = c * -1;
        }if ( d < 0){
            d = d * -1;
        }
        int mini = min(a,b,c,d);
        return mini += Mittelwert;
    }
    public static void eingabe ( Scanner sc){
        if (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            System.out.println("Eingabe : " + a + " " + b + " " + c + " " + d);
            System.out.println("Minimum : " + min(a, b, c, d));
            System.out.println("Mittelwert : " + mean(a, b, c, d));
            System.out.println("am nächsten am Mittelwert : " + nextToMean(a, b, c, d));
        }
        System.out.print("");
    }
}
