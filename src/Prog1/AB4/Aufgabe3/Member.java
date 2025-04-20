package Prog1.AB4.Aufgabe3;

public class Member {
    private String name;
    private int mitgliederNr;
    private int kursAnzahl;
    private double kursKosten;

    private static int naechsteNr = 10000;
    private static double mitBeitrag = 90.0;

    public Member(String name) {
        this.name = name;
        this.mitgliederNr = naechsteNr++;
        this.kursAnzahl = 0;
        this.kursKosten = 0.0;
    }

    public void setMitBeitrag(double neu) {
        mitBeitrag = neu;
    }

    public int getKursAnzahl() {
        return kursAnzahl;
    }

    public void buchen(Kurs kurs) {
        kurs.anmelden();
        kursAnzahl++;
        kursKosten += kurs.getKursGebuehr();
    }

    public double monatsRechnung() {
        return mitBeitrag + kursKosten;
    }

    public String toString() {
        return "Name: " + name + ", Mitgliedsnummer: " + mitgliederNr;
    }
}
