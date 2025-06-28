package Prog1.AltKlausur.Klausuren.SS20;

public class A3 {
    public static double teilsumme(double[] a, int i, int j) throws FalscheParameterException {
        double summe = 0.0;
        if(a == null || i < 0 || j > a.length || i >= j) {
            throw new FalscheParameterException();
        }

        for(int k = i;k < j; k++) {
            summe += a[k];
        }

        return summe;
    }

    public static void testTeilSumme(int i, int j) {
        double[] a = {1.0,2.0,3.0};

        try {
            System.out.println(teilsumme(a,i,j));
        } catch (FalscheParameterException e) {
            System.out.println("Fehler bei teilsumme " + e.getMessage());
        }
    }
}
