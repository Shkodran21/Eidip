public class Mathe2 {
    public static int fakRek(int a){
        if( a <= 1){
            return 1;
        }else{
         return fakRek(a - 1) * a;
        }
    }
public static int fakLoop(int b){
        int c = 0;
        while( c < b){
            c += c * b;
            c++;
        }
        return c;
}
public static void quadrateAusgabeRueck(int n){
        int d = n ;
        int f = n;
        while( d >= 1){
            System.out.println( d * f);
            d--;
            f--;
        }
}
}
