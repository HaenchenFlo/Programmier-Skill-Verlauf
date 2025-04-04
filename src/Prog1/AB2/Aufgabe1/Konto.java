package Prog1.AB2.Aufgabe1;

public class Konto {
    private int kontoNummer;
    private String name;
    private double kontoStand;
    private int buchungen;

    public Konto(String name, int kontonummer) {
        this.kontoNummer = kontonummer;
        this.name = name;
        this.kontoStand = 0.0;
        this.buchungen = 0;
    }

    public void setName(String neuerName) {
        this.name = neuerName;
    }

    public double getKontoStand() {
        return kontoStand;
    }

    public int getBuchungen() {
        return buchungen;
    }

    public double einzahlen(double betrag) {
        kontoStand += betrag;
        buchungen++;
        return kontoStand;
    }

    public double auszahlen(double betrag) {
        kontoStand -= betrag;
        buchungen++;
        return kontoStand;
    }

    public String toString() {
        return "Name: " + name + ", Kontonummer: " + kontoNummer + ", Kontostand: " + kontoStand;
    }
}
