package Prog1.AltKlausur.Klausuren.SS22;

public class A3 {
    private static int[] highscore = new int[11];
    private static int anz = 0;

    public static void eintragen(int erg) {
        highscore[anz] = erg;
        int i = anz;

        while(highscore[anz] < erg && i > 0) {
            highscore[anz] = highscore[anz - 1];
            highscore[anz - 1] = erg;
            i--;
        }

        if(anz < 10) {
            anz++;
        }
    }

    public static void ausgabe() {
        for(int i = 0; i < anz; i++) {
            System.out.println("Highscore: " + highscore[i]);
        }
    }
}
