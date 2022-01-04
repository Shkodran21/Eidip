public class Mathe {
    public static int abs(int n){
        if( n < 0 ){
            n = n * -1;
        }
        return n;
    }
public static int max3(int a,int b,int c){
        int d = 0;
        if( a > b & a > c){
            d = a;
        }else if( b > a & b > c){
            d = b;
        }else{
            d = c;
        }
    return d;
}
}
