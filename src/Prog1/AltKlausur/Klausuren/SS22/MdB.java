package Prog1.AltKlausur.Klausuren.SS22;

import Prog1.AltKlausur.Klausuren.SS23.Person;

public class MdB extends Person {
    private int nr;

    public MdB(String name, int gebJahr) {
        super(name, gebJahr);
        this.nr = 0;
    }

    public int getNr() {
        return this.nr;
    }

    public void setNr(int neu) {
        this.nr = neu;
    }

    public String toString() {
        String name = this.name();
        if(nr > 0) {
            name += nr;
        }
        return name;
    }
}
