/**
 * @author sfaniq2s
 */
public class Mathe {
        public static boolean istPrimLoop(int a) {
            boolean s = true;
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    s = false;
                }
            }
            if(a == 1 | a == 0){
                return false;
            }
            return s;
        }

        public static boolean istPrimRek(int a) {
            return istPrimLoop(a);
        }
}
