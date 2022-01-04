public class Datum {
    public static boolean istSchaltjahr(int Datum) {
        if (Datum < 1583) {
            if (Datum % 4 == 0 & Datum > 0) {
                return true;
            } else {
                return false;
            }
        }else{
            if (Datum % 4 == 0 & (Datum % 100 > 0 | (Datum % 100 == 0 & Datum % 400 == 0))) {
                return true;
            } else {
                return false;
            }
        }
    }
}
