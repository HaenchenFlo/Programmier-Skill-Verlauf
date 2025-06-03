package Prog1.ZL.Test1;

public class Automat {
    private String standort;
    private double tarif;
    private int anzahl;
    private double betrag;

    public Automat(String standort, double tarif) {
        this.standort = standort;
        this.tarif = tarif;
        this.anzahl = 0;
        this.betrag = 0.0;
    }

    public String getStandort() {
        return this.standort;
    }

    public double getTarif() {
        return this.tarif;
    }

    public int getAnzahl() {
        return this.anzahl;
    }

    public double getBetrag() {
        return this.betrag;
    }

    public void setTarif(double nT) {
        this.tarif = nT;
    }

    public String erzeugeTicket(int dauer) {
        anzahl++;
        betrag += tarif * dauer;
        return "Standort: " + standort + ", Parkdauer: " + dauer + "Std";
    }
}
