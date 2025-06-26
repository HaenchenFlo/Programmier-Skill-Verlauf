package Prog1.AB11.Aufgabe3;

public class Waffe extends Gegenstand implements Tragbar, Kaufbar {
    private double gewicht;
    private double preis;

    public Waffe(String bezeichnung, double gewicht, double preis) {
        super(bezeichnung);
        this.gewicht = gewicht;
        this.preis = preis;
    }

    @Override
    public double gewicht() {
        return this.gewicht;
    }

    @Override
    public double preis() {
        return this.preis;
    }
}
