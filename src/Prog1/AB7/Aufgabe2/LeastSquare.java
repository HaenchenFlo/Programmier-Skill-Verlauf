package Prog1.AB7.Aufgabe2;

public class LeastSquare {
    public static double[] leastSquares(Punkt[] punkte) {
        int n = punkte.length;
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;
        for(int i = 0; i < n; i++) {
            Punkt p = punkte[i];
            sumX += p.x;
            sumY += p.y;
            sumXY += p.x * p.y;
            sumX2 += p.x * p.x;
        }
        double a = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
        double b = (sumY * sumX2 - sumX * sumXY) / (n * sumX2 - sumX * sumX);

        return new double[]{a,b};
    }
}



