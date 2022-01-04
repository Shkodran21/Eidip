/**
 * @author sfaniq2s
 */
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Matrix {
    private double[][] t;

    public Matrix(int z, int s) {
        try {
            if (z <= 0 | s <= 0) {
                throw new Exception();
            }
            double[][] f = new double[z][s];
            this.t = f;
            for (int i = 0; i < z; i++) {
                int d;
                for (d = 0; d < s; d++) {
                    this.t[i][d] = 0.0;
                }
                d = 0;
            }
        } catch (Exception ex) {
            if (z >= 0 & s >= 0 | z < 0 | s < 0) {
                throw new IllegalArgumentException();
            } else {
                throw new NullPointerException();
            }
        }
    }

    public Matrix(int n) {
        try {
            if (n <= 0) {
                throw new Exception();
            }
            double[][] f = new double[n][n];
            this.t = f;
            for (int i = 0; i < n; i++) {
                int d;
                for (d = 0; d < n; d++) {
                    this.t[i][d] = 0.0;
                }
                d = 0;
            }
        } catch (Exception ex) {
            if (n >= 0 | n < 0) {
                throw new IllegalArgumentException();
            } else {
                throw new NullPointerException();
            }
        }
    }

    public Matrix(Matrix m) {
        if (m == null) {
            throw new NullPointerException();
        }
        this.t = m.t;
    }

    public int zeilen() {
        return this.t.length;
    }

    public int spalten() {
        return this.t[0].length;
    }

    public double get(int z, int s) {
        try {
            return this.t[z][s];
        } catch (Exception ex) {
            if (z >= zeilen() | s >= spalten() | z < 0 | s < 0) {
                throw new IllegalArgumentException();
            } else {
                throw new NullPointerException();
            }
        }
    }

    public Matrix set(int z, int s, double e) {
        try {
            this.t[z][s] = e;
            return Matrix.this;
        } catch (Exception ex) {
            if (z < 0 | s < 0 | z >= zeilen() | s >= spalten()) {
                throw new IllegalArgumentException();
            } else {
                throw new NullPointerException();
            }
        }
    }

    public Matrix setAll(double e) {
        for (int i = 0; i < zeilen(); i++) {
            int d;
            for (d = 0; d < spalten(); d++) {
                this.t[i][d] = e;
            }
            d = 0;
        }
        return Matrix.this;
    }

    public Matrix setZeile(int z, double[] f) {
        try {
            if (f == null) {
                throw new NullPointerException();
            }
            if (z > zeilen() | f.length > spalten() | z < 0) {
                throw new IllegalArgumentException();
            }
            for (int i = 0; i < spalten(); ++i) {
                this.t[z][i] = f[i];
            }
            return Matrix.this;
        }catch(ArrayIndexOutOfBoundsException ex){
            throw new IllegalArgumentException();
        }
    }

    public Matrix setSpalte(int s, double f[]) {
        try{
        if (s > spalten() | f.length > zeilen() | s < 0) {
            throw new IllegalArgumentException();
        } if (f == null ) {
            throw new NullPointerException();
        }
            for (int i = 0; i < zeilen(); i++) {
                this.t[i][s] = f[i];
            }
            return Matrix.this;
        }catch(ArrayIndexOutOfBoundsException ex){
            throw new IllegalArgumentException();
        }
    }
    public boolean equals(Matrix m) {
        if (m == null) {
            throw new NullPointerException();
        }
        if(zeilen() != m.zeilen() | spalten() != m.spalten()){
            return false;
        }
        for (int i = 0; i < zeilen(); i++) {
            for (int j = 0; j < spalten(); j++) {
                if (!Mathe.equals(t[i][j], m.t[i][j])){
                    return false;
                }
            }
        }
        return true;
    }
    public String toString() {
        String Inhalt = "";
        String Ausgabe = "";

        for (int z = 0; z < t.length; ++z) {
            for (int s = 0; s < t[z].length; ++s) {
                Inhalt += "" + t[z][s] + " ";
            }
            Ausgabe += "( " + Inhalt + ")" + "\n";
            Inhalt = "";
        }
        return Ausgabe;
    }

    public Matrix eingabe(Scanner sc) {
        try {
            int j = 0;
            Matrix q = new Matrix(zeilen(),spalten());
            Matrix h = new Matrix(zeilen(),spalten());
            h.setAll(0.0);
            t = h.t;
            int u = 0;
            for (int i = 0; i < zeilen(); i++) {
                while (j < spalten()) {
                    String s = sc.next();
                    if (s.equals("(") | s.equals(")")) {
                        ++u;
                    } else {
                        t[i][j] = Double.parseDouble(s); //Wirft InputMismatchException wenn Eingabe nicht double
                        ++j;
                    }
                }
                j = 0;
            }
            if(u == 0){
                throw new Exception();
            }
            return this;
        } catch (Exception e) {
            Matrix h = new Matrix(zeilen(),spalten());
            h.setAll(0.0);
            if (t.equals(h.t)) {
                throw new NullPointerException();
            } else {
                throw new InputMismatchException();
            }
        }
    }
}
