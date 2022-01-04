/**
 * @author sfaniq2s
 */
public class Mathe {
    public static int ggTAdd ( int a,int b){
        if ( a == 0){
            return b;
        }
        if ( b == 0){
            return a;
        }
        if ( a > b){
            a = a-b;
        }
        if ( b >= a){
            b = b -a;
        }
        return ggTAdd(a,b);
    }
    public static int ggTMul ( int a,int b){
        int t = 0;
        if ( b > 0){
            t = a % b;
            a = b;
            b = t;
            return ggTMul(a,b);
        }
        return a;
    }
    public static void ggTAddOut(int a,int b){
        int zähler = 1;
        System.out.println( a + " " + b);
        while ( a != 0 & b != 0) {
            if (a > b) {
                a = a - b;
                System.out.println(a + " " + b);
            }
            if (b >= a) {
                b = b - a;
                System.out.println(a + " " + b);
            }
            zähler++;
        }
        System.out.print("Wiederholungen : " + zähler);
        }
        public static void ggTMulOut(int a,int b){
        int t = 1;
        int zähler = 0;
        System.out.println( a + " " + b);
        while ( b > 0){
            t = a % b;
            a = b;
            b = t;
            zähler++;
            System.out.println( a + " " + b);
        }
        System.out.print("Wiederholungen : " + zähler);
    }
        public static void ggT( int a,int b){
        a = Math.abs(a);
        b = Math.abs(b);
        System.out.print(ggTMul(a,b));
    }
}


