/**
 * @author sfaniq2s
 */
public class Feld {
    public static int[] umkehren(int []f ){
        int n [] = new int[f.length];
        int a = 0;
        for(int i = f.length-1;i >= 0;i--){
            n[a] = f[i];
            a++;
        }
        // System.out.println(java.util.Arrays.toString(n));
        return n;
    }
    public static void umkehrenInPlace(int [] f){
        int a = 0;
        int speicher = 0;
        for(int i = f.length-1; i >= f.length/2;i--,a++){
            speicher = f[a];
            f[a] = f[i];
            f[i] = speicher;
        }
        System.out.println((f));
    }
}