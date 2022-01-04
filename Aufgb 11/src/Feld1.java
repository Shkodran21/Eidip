/**
 * @author sfaniq2s
 */
public class Feld1 {
    public static boolean istHomogen(int[] f) {
        int i = 0;
        int n = f.length - 1;
        while (i <= n) {
            if (f[i] == f[n]) {

            } else {
                return false;
            }
            i++;
            n--;
        }
        return true;
    }

    public static boolean istSortiert(int f[]) {
        try {
            int a = 0;
            int b = 0;
            if (f.length < 1) {
                return true;
            }
            while (a < f.length) {
                while (b < f.length) {
                    if (f[a] <= f[b]) {
                        b++;
                    } else {
                        return false;
                    }
                }
                a++;
                b = a;
            }
            return true;
        } catch (IllegalArgumentException ex) {
            throw new IllegalArgumentException();
        }
    }

    public static int maxPos(int f[]) {
            if(f.length == 0){
                throw new IllegalArgumentException();
            }
            int a = 0;
            int max = f[0];
            for (int i = 0; i < f.length; i++) {
                if (f[i] > max) {
                    max = f[i];
                    a = i;
                }
            }
            return a;
    }

    public static int maxElement(int f[]) {
        if(f.length == 0){
            throw new IllegalArgumentException();
        }
        int max = f[0];
        for (int i = 0; i < f.length; i++) {
            if (f[i] >= max) {
                max = f[i];
            }
        }
        return max;
    }

    public static int[] max(int f1[], int f2[]) {
        try {
            if(f1.length != f2.length){
                throw new IllegalArgumentException();
            }
            int rg[] = new int[f1.length];
            for (int i = 0; i < f1.length; i++) {
                if (f1[i] >= f2[i]) {
                    rg[i] += f1[i];
                } else {
                    rg[i] += f2[i];
                }
            }
            return rg;
        } catch (Exception ex) {
            if(f1.length == 0 & f2.length == 0){
                throw new NullPointerException();
            }else {
                throw new IllegalArgumentException();
            }
        }
    }
}
