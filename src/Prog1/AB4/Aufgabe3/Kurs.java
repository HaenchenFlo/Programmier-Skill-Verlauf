package Prog1.AB4.Aufgabe3;

public class Kurs {
    private String kursName;
    private double kursGebuehr;
    private int kursTeilnehmer;

    private static double gesamtEinnahmen = 0.0;

    public Kurs(String kursName, double kursGebuehr) {
        this.kursName = kursName;
        this.kursGebuehr = kursGebuehr;
        kursTeilnehmer = 0;
    }

    public double getKursGebuehr() {
        return this.kursGebuehr;
    }

    public static double getGesamtEinnahmen() {
        return gesamtEinnahmen;
    }

    public int getKursTeilnehmer() {
        return kursTeilnehmer;
    }

    public void anmelden() {
        kursTeilnehmer++;
        gesamtEinnahmen += kursGebuehr;
    }

    public String toString() {
        return "Kursname: " + this.kursName;
    }
}
