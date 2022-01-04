import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class test {
    public static void main(String []args){
        Matrix m = new Matrix(3);
        m.set(0,0,1.0);
        m.set(0,1,2.0);
        m.set(0,2,3.0);
        m.set(1,0,2.0);
        m.set(1,1,1.0);
        m.set(1,2,3.0);
        m.set(2,0,3.0);
        m.set(2,1,2.0);
        m.set(2,2,1.0);
        System.out.println(m.toString());
        }
    }
