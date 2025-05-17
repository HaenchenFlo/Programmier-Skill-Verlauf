package Prog1.AB7.Aufgabe2;

import java.util.Arrays;

public class TemperaturAnalyse {
    public static void main(String[] args) {
        int[] jahre = {8,9,10,11,12,13,14,15};
        double[] temperaturen = {19.4,19.2,21.8,17.3,18.7,20.5,20.6,20.6};

        Punkt[] daten = new Punkt[jahre.length];
        for (int i = 0; i < jahre.length; i++) {
            daten[i] = new Punkt(jahre[i], temperaturen[i]);
        }

        double[] ergebnis = LeastSquare.leastSquares(daten);
        System.out.println(Arrays.toString(daten));
        System.out.printf("Ermittelte Gerade: y = %.4fx + %.4f\n", ergebnis[0], ergebnis[1]);
    }
}
