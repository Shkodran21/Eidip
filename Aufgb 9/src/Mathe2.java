public class Mathe2 {
    public static int addRek(int a,int b){
        if( a < 0){
            a++;
            b--;
            return addRek(a,b);
        }
        else if(a > 0){
            a--;
            b++;
            return addRek(a,b);
        }else{
            return b;
        }
    }
    public static int subRek(int a,int b){
        return a-b;
    }
}
