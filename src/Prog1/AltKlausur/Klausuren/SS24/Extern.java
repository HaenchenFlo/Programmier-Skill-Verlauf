package Prog1.AltKlausur.Klausuren.SS24;

import Prog1.AltKlausur.Klausuren.SS23.Person;

public class Extern extends Projekte {
    private Person begleiter;

    public Extern(String titel, Person leiter,Person begleiter) {
        super(titel,leiter);
        this.begleiter = begleiter;
    }

    public Extern(String titel, Person leiter) {
        super(titel,leiter);
        this.begleiter = null;
    }

    public void setBegleiter(Person neu) {
        this.begleiter = neu;
    }

    public boolean begleitung() {
        return this.begleiter != null;
    }
}
