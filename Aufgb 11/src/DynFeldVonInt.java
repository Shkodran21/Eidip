/**
 * @author sfaniq2s
 */
import java.util.Arrays;
public class DynFeldVonInt {
    private int[] a;

    public DynFeldVonInt(int länge){
        if(länge < 0){
            throw new IllegalArgumentException();
        }
        this.a = new int[länge];
    }
    public DynFeldVonInt(int [] array){
        this.a = array;
    }
    public int length(){
        return this.a.length;
    }
    public int get(int i) {
        try {
            if( i < 0 | i >= this.a.length){
                throw new Exception();
            }
            return this.a[i];
        } catch (Exception ex) {
            throw new IndexOutOfBoundsException();
        }
    }
    public void set(int i,int v) {
        try {
            if( i < 0 | i >= this.a.length){
                throw new Exception();
            }
            this.a[i] = v;
        } catch (Exception ex) {
            throw new IndexOutOfBoundsException();
        }
    }
    public void insert(int i,int k) {
       try {
           if( i < 0 | i >= this.a.length){
               throw new Exception();
           }
            int s = 0;
            int [] b = new int[a.length + k];
            for (int n = 0; s < a.length; n++) {
                if(n < i){
                    b[n] = a[s];
                    s++;
                }if(n >= i & n <= i+k){
                    b[n] = 0;
                }if(n >= i+k){
                    b[n] = a[s];
                    s++;
                }
            }
            this.a = b;
         } catch (Exception ex) {
           if(k < 0){
               throw new IllegalArgumentException();
           }else {
               throw new IndexOutOfBoundsException();
           }
        }
    }
    public void remove(int i,int k) {
        try {
            if( i < 0 | i >= this.a.length){
                throw new Exception();
            }
            int[] b = new int[a.length-k];
            if(this.a.length <= 2){
                throw new Exception();
            }
            int p = 0;
            int [] q = new int [a.length - k];
            if (i == 0) {
                while (p < a.length - k) {
                    q[p] = a[p+k];
                    ++p;
                }
            }
            if (i+k == a.length) {
                while (p < i) {
                    q[p] = a[p];
                    ++p;
                }
            }
            else {
                while (p < a.length) {
                    if (p < i) {
                        q[p] = a[p];
                        ++p;
                    }
                    if (p >= i & p < i+k) {
                        ++p;
                    }
                    if (p >= i + k) {
                        q[p-(k)] = a[p];
                        ++p;
                    }
                }
            }
            this.a = q;
        } catch (Exception ex) {
            if(k < 0){
                throw new IllegalArgumentException();
            }else {
                throw new IndexOutOfBoundsException();
            }
        }
    }
    public boolean equals(DynFeldVonInt b) {
            if(b.a.length != this.a.length){
                return false;
            }
            for (int i = 0; i < this.a.length; i++) {
                for (int j = 0; j < b.a.length; j++) {
                    if (this.a[i] != b.a[j]) {
                        return false;
                    }
                }
            }
            return true;
    }
    public String toString() {
            String a = Arrays.toString(this.a);
            String ausgabe = "";
            for(int i = 0;i < a.length();i++){
                if(Character.isWhitespace(a.charAt(i))){

                }else{
                    ausgabe += a.charAt(i);
                }
            }
            return ausgabe;
    }
}
