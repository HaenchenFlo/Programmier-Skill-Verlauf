package AB3.Aufgabe3;

public class Fahrzeug {
    public String kennzeichen;
    public double tagesPreis;
    public double kmPreis;
    public static double versGeb = 20;
    public static double gesamtEinnahmen = 0.0;

    // Konstruktor
    public Fahrzeug(String kennzeichen, double tagesPreis, double kmPreis) {
        this.kennzeichen = kennzeichen;
        this.tagesPreis = tagesPreis;
        this.kmPreis = kmPreis;
    }

    public Fahrzeug(String kennzeichen) {
        this.kennzeichen = kennzeichen;
        this.tagesPreis = 25.50;
        this.kmPreis = 0.1;
    }

    //getter
    public String getKennzeichen() {
        return kennzeichen;
    }

    public double getTagesPreis() {
        return tagesPreis;
    }

    public double getKmPreis() {
        return kmPreis;
    }

    public static double getVersGeb() {
        return versGeb;
    }

    public static double getGesamtEinnahmen() {
        return gesamtEinnahmen;
    }

    // setter

    public void setTagesPreis(double tagesPreis) {
        this.tagesPreis = tagesPreis;
    }

    public void setKmPreis(double kmPreis) {
        this.kmPreis = kmPreis;
    }

    public static void setVersGeb(double versGebNeu) {
        versGeb = versGebNeu;
    }

    //methoden

    public double rechnung(int mietdauer, double gefahreneKm) {
        double gesamtPreis = mietdauer * tagesPreis + gefahreneKm * kmPreis + versGeb;

        gesamtEinnahmen += gesamtPreis;

        System.out.println("Rechnung für das Fahrzeug: " + kennzeichen);
        System.out.println("Mietdauer: " + mietdauer + " Tage");
        System.out.println("Gefahrene Kilometer: " + gefahreneKm + " km");
        System.out.println("Versicherungskosten: " + versGeb + " €");
        System.out.println("Der Gesamtpreis ist: " + gesamtPreis + "€");

        return gesamtPreis;
    }

    public String toString() {
        return "Fahrzeug [kennzeichen=" + kennzeichen + ", tagesPreis=" + tagesPreis + ", kmPreis=" + kmPreis + " ,Versicherungsgebühr =" + versGeb + "]";
    }


}
