package Prog1.AltKlausur.Klausuren.SS20;

public class Artikel1A {
    private String bez;
    private int nr;
    private double nettoPreis;

    private static int naechsteNummer = 0;
    private static double mwst = 0.19;

    public Artikel1A(String bez, double nettoPreis) {
        this.bez = bez;
        this.nettoPreis = nettoPreis;
        this.nr = naechsteNummer++;
    }

    public static void setMwst(double neu) {
        mwst = neu;
    }

    public double bruttoPreis() {
        return nettoPreis * (1 + mwst);
    }

    public String toString() {
        return "Artikelnummer: " + nr + ", Bezeichnung: " + bez;
    }
}
