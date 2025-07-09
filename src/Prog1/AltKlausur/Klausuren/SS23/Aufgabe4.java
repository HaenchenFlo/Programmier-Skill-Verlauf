package Prog1.AltKlausur.Klausuren.SS23;

public class Aufgabe4 {
    public static Sportler sieger(Sportler[] a) {
        double maxWeite = 0.0;
        Sportler s = null;
        double[] w;
        for(int i = 0; i < a.length; i++) {
            w = a[i].weite();
            for(int j = 0; j < w.length; j++) {
                if(w[j] > maxWeite){
                    s = a[i];
                    maxWeite = w[j];
                }
            }
        }
        return s;
    }

    public static class Sportler {
        double[] versuche = new double[6];

        public double[] weite() {
            return versuche;
        }
    }
}

