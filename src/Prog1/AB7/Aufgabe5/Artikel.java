package Prog1.AB7.Aufgabe5;

public class Artikel {
    private String bezeichnung;
    private double preis;
    private int artikelNr;
    private static int artikelZaehler = 1;

    public Artikel(String bezeichnung, double preis) {
        this.bezeichnung = bezeichnung;
        this.preis = preis;
        this.artikelNr = artikelZaehler++;
    }

    public String getBezeichnung() {
        return this.bezeichnung;
    }

    public double getPreis() {
        return this.preis;
    }

    public String toString() {
        return "Artikel #" + artikelNr + ": " + bezeichnung + " - " + preis + " EUR";
    }
}
