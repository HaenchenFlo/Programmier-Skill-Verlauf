package Prog1.AltKlausur.Klausuren.SS24;

import Prog1.AltKlausur.Klausuren.SS23.Person;

public abstract class Projekte {
    private Person leiter;
    private String titel;
    private int tn;

    private static int gesamt = 0;

    public Projekte(String titel, Person leiter) {
        this.titel = titel;
        this.leiter = leiter;
    }

    public void setTn(int max) {
        gesamt -= tn;
        tn += max;
        gesamt += max;
    }

    public static int getGesamt() {
        return gesamt;
    }

    public String toString() {
        return titel + " " + leiter.name();
    }
}
