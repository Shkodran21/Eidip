/**
 * @author sfaniq2s
 */
public class Mathe1 {
    public static int addLoop(int a, int b) {
        int s = 0;
        for(int i = 0;i < a | i > a;i++,s++){
            if(i > a){
                s--;s--;
                i--;i--;
            }
        }
        for(int n = 0;n < b | n > b;n++,s++){
            if(n > b){
                s--;s--;
                n--;n--;
            }
        }
        return s;
    }
    public static int subLoop(int a,int b){
        int s = a;
        int n = b;
        while(n != 0){
            s--;
            n--;
            if(n < 0){
                n++;n++;
                s++;s++;
            }
        }
        return s;
    }
    public static int mulLoop(int a,int b){
        int s = 0;
        int n = 0;
        while(s < b){
            n = addLoop(n,addLoop(a,0));
            s++;
        }
        while(s > b){
            n = addLoop(n,addLoop(a,0));
            s--;
        }
        if(a < 0 & b < 0){
            n = Math.abs(n);
        }if( a > 0 & b < 0){
            n = n * -1;
        }
        return n;
    }
    public static int divLoop(int a,int b){
        int s = 0;
        int n = 0;
        while(s < a | s > a){
            s = addLoop(s,addLoop(b,0));
            n++;
            if(s > a){
                s = a;
                n--;
            }
        }
        return n;
    }
    public static int modLoop(int a,int b){
        if(divLoop(a,b) < 1){
            int s = divLoop(a,b);
            s = mulLoop(s,b);
            s = subLoop(a,s);
            return s;
        }
        if(divLoop(a,b) == mulLoop(b,divLoop(a,b))){
            return 0;
        }else{
            int s = divLoop(a,b);
            s = mulLoop(s,b);
            s = subLoop(a,s);
            return s;
        }
    }
    public static int powLoop(int a,int b){
        int s = a;
        for(int i = 1;i < b;i++){
            s = mulLoop(s,a);
        }
        if(b == 0){
            return 1;
        }
        return s;
    }
}
