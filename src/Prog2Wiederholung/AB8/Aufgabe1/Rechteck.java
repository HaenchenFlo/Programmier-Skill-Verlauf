package Prog2Wiederholung.AB8.Aufgabe1;

public class Rechteck {
    private double laenge;
    private double breite;

    public Rechteck(double laenge, double breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    public double umfang() {
        return 2 * (laenge + breite);
    }

    public double flaeche() {
        return laenge * breite;
    }

    public double getLaenge() {
        return laenge;
    }

    public double getBreite() {
        return breite;
    }

    @Override
    public String toString() {
        return String.format("Rechteck(%.2f x %.2f)", laenge, breite);
    }
}
