package Prog1.AltKlausur.Klausuren.SS22;

import Prog1.AltKlausur.Klausuren.SS23.Person;

public abstract class Mitarbeiter extends Person {
    private static int neueNr = 0;

    private int persNr;

    public Mitarbeiter(String name, int gebJahr) {
        super(name, gebJahr);

        this.persNr = neueNr++;
    }

    public int getPersNr() {
        return this.persNr;
    }

    public String toString() {
        return "Name: " + name() + ", PersNr: " + this.persNr;
    }

    public abstract double gehalt();
}
