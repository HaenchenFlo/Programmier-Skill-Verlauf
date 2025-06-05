package Prog2.AB3.Aufgabe4;

import Prog2.AB3.Aufgabe3.Menge;
import Prog2.AB3.Aufgabe3.MengeDynArray;
import Prog2.AB4.Aufgabe3.MengeEVL;

public class Modul {
    private String bezeichnung;
    private int ECTS;

    private Menge<Student> teilnehmer;

    public Modul(String bezeichnung, int ECTS) {
        this.teilnehmer = new MengeEVL<>();
        this.bezeichnung = bezeichnung;
        this.ECTS = ECTS;
    }

    public int getECTS() {
        return this.ECTS;
    }
    public String getBezeichnung() {
        return this.bezeichnung;
    }

    public void anmelden(Student s) {
        teilnehmer.insert(s);
    }

    public void abmelden(Student s) {
        teilnehmer.delete(s);
    }

    public boolean istAngemeldet(Student s) {
        return teilnehmer.contains(s);
    }

    public int getAnzahlTeilnehmer() {
        return teilnehmer.size();
    }

}
