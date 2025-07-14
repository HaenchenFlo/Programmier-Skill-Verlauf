package Prog1.AltKlausur.Klausuren.SS24;

import Prog1.AltKlausur.Klausuren.SS23.Person;

public class Intern extends Projekte {
    private int raumNr;

    public Intern(String titel, Person leiter,int raumNr) {
        super(titel, leiter);
        this.raumNr = raumNr;
    }


}
