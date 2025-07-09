package Prog1.AltKlausur.Klausuren.SS23;

public abstract class Mitglied extends Person{
    private static int naechsteNr = 1;
    private int mitgliedNr;

    public Mitglied(String name, int gebJahr) {
        super(name, gebJahr);
        this.mitgliedNr = naechsteNr++;
    }

    public int getMitglieder() {
        return naechsteNr;
    }

    public abstract double beitrag();
}
