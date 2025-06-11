package Prog1.AB10.Aufgabe2;

public class QuadratischeGleichung {
    public static double[] loeseQuadrGlchg(double a, double b, double c) throws QuadrGlchgException {
        if(a == 0) {
            throw new QuadrGlchgException("Keine Quadratische Gleichung");
        }

        double wurzel = Math.sqrt(b * b - 4 * a * c);

        if(wurzel == 0) {
            throw new QuadrGlchgException("Doppelete Nullstelle (eine Lösung)!");
        }
        if(wurzel < 0) {
            throw new QuadrGlchgException("Keine Lösung!");
        }

        double x1 = (-b + wurzel) / (2 * a);
        double x2 = (-b - wurzel) / (2 * a);

        return new double[]{x1,x2};
    }
}
