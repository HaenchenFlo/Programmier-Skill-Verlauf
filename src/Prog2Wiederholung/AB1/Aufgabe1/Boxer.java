package Prog2Wiederholung.AB1.Aufgabe1;

public class Boxer extends Sportler {
    public Boxer(String name, int gebJahr, int groesse, double gewicht) {
        super(name, gebJahr, groesse, gewicht);
    }

    public String gewichtsKlasse() {
        if(this.getGewicht() < 70) {
            return "Leicht";
        } else if (this.getGewicht() > 90) {
            return "Schwer";
        } else {
            return "Mittel";
        }
    }

    public void setGewicht(double gewichtNeu) {
        this.gewicht = gewichtNeu;
    }

    @Override
    public String info() {
        return "Gewichtsklasse: " + gewichtsKlasse();
    }
}
