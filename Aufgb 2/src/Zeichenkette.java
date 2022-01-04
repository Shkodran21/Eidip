public class Zeichenkette {
    public static String grussMitZeit( int stunde,String name){
        if ( stunde <= 12){
            return "Guten Morgen, " + name + "!";
        }else if( stunde >= 18){
            return "Guten Abend, " + name + "!";
        }else{
            return "Guten Tag, " + name + "!";
        }
    }
    public static String zitronenEis(int n){
        int a = 0;
        String b = "";
        String c = "";
        while( a < n){
            b += "super";
            c += "Z";
            a++;

        }
        return b + "leckeres " + c + "Zitroneneis";
    }
}
