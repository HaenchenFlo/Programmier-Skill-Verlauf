package Prog1.AltKlausur.Klausuren.SS21;

public class A2 {
    public static double[] pandemie(double[] a) {
        double[] erg = new double[30];
        int l = a.length;
        for(int i = 0; i < erg.length; i++) {
            double sum = 0;
            for(int j = l; j <= 7; j++) {
                sum += a[l + 1 - 30 + i]; // - j  --> Inzidenz der Woche
            }
            erg[i] = sum; // Durchschnitt der 7 Tage nicht errechnet
        }

        return erg;
    }
}
