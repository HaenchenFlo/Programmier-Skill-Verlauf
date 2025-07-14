package Prog1.AltKlausur.Klausuren.SS24;

import Prog1.AltKlausur.Klausuren.SS23.Person;

public class Outdoor extends Projekte {

    public Outdoor(String titel, Person leiter) {
        super(titel,leiter);
    }

    public String toString() {
        return super.toString() + "(outdoor)";
    }
}
