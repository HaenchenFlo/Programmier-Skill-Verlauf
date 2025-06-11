package Prog1.AB9.Aufgabe1;

public abstract class GeoFigur {
    private String farbe;

    public GeoFigur(String farbe) {
        this.farbe = farbe;
    }

    public abstract double berechneUmfang();

    public abstract double fInhalt();

}
