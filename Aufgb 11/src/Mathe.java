public class Mathe {
    public static boolean equals(double x, double y) {
        double eps = 0.000001;
        return (x == y || (Math.abs(x-y) / Math.max(Math.abs(x),Math.abs(y))) < eps);
    }
}