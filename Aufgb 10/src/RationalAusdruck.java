/**
 * @author sfaniq2s
 */
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class RationalAusdruck {
    private static Rational Rational;

    public static Rational auswertung(Rational a,char op,Rational b){
        if(op == '+'){
            return new Rational(a.add(b));
        }
        if(op == '-'){
            return new Rational(a.sub(b));
        }
        if(op == '*') {
            return new Rational(a.mul(b));
        }
        if(op == '/'){
            return new Rational(a.div(b));
        }else{
            throw new IllegalArgumentException("ungueltiges Zeichen für op");
        }
    }
    public static Rational next(Scanner x){
        try {
            String r1 = x.next();
            String op = x.next();
            String r2 = x.next();
            if(op.length() != 1) {
                throw new InputMismatchException();
            }
            Rational r = auswertung(Rational.parse(r1), op.charAt(0), Rational.parse(r2));
            return r;
        }catch(ArithmeticException a){
             throw new ArithmeticException();
        }catch(Exception e){
            throw new InputMismatchException();
        }
    }
    public static void dialog()
        throws IOException {
            Scanner x = new Scanner(System.in);
            try {
                while (x.hasNext()) {
                    System.out.println("= " + next(x));
                }
            } catch (Exception e) {
                throw new IOException(e);
        }
    }
}
