package Prog1.AB7.Aufgabe2;

import java.util.Arrays;

public class TemperaturAnalyse {
    public static void main(String[] args) {
        int[] jahre = {2,3,5,7,9};
        double[] temperaturen = {4,5,7,10,15};

        Punkt[] daten = new Punkt[jahre.length];
        for (int i = 0; i < jahre.length; i++) {
            daten[i] = new Punkt(jahre[i], temperaturen[i]);
        }

        double[] ergebnis = LeastSquare.leastSquares(daten);
        System.out.println(Arrays.toString(daten));
        System.out.printf("Ermittelte Gerade: y = %.4fx + %.4f\n", ergebnis[0], ergebnis[1]);
    }
}
