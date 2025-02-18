package Prog1.AB3.Aufgabe1;

public class Kunde {
    private String name;
    private int kundennummer;
    private static int nummerZaehler = 1;

    public Kunde(String name) {
        this.name = name;
        this.kundennummer = nummerZaehler;
        nummerZaehler++;
    }

    public String toString() {
        return "Name: " + this.name + ", Kundennummer: " + this.kundennummer;
    }

    public static int anzahlKunden() {
        return nummerZaehler - 1;
    }
}
