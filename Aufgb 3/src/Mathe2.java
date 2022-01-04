public class Mathe2 {
    public static void ausgabeVielfache (int a,int n){
        String s = "";
        for ( int b = 1; b <= n; b++){
            s += a * b + " ";
        }
        System.out.println(s);
    }
    public static void ausgabe1x1 (int n){
        for ( int i = 1; i <= n;i++){
            ausgabeVielfache(i,n);
        }
    }
}
