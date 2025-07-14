package Prog1.AB7.Aufgabe4;

public class Gauss {
    public static void gaussJordan(double[][] A, int m , int k, double alpha) {
        // Java-Index beginnt bei 0, daher -1 bei k und m
        k = k - 1;
        m = m - 1;

        for (int j = 0; j < A[0].length; j++) {
            A[m][j] = A[m][j] + alpha * A[k][j];
        }
    }

    public static void main(String[] args) {
        double[][] m = {
                {1.1, 2.2, -3.3, 4.4},
                {5.0, -6.2, 6.4, -8.8},
                {0.0, 8.0, 1.0, 0.5}
        };

        // addiere -0.5 * Zeile 2 zur Zeile 3
        gaussJordan(m, 3, 2, -0.5);

        // Ausgabe der Matrix nach dem Schritt
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%6.2f ", m[i][j]);
            }
            System.out.println();
        }
    }
}
