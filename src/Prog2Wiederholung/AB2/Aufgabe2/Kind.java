package Prog2Wiederholung.AB2.Aufgabe2;

import Prog2Wiederholung.AB2.Aufgabe1.Paar;

public class Kind extends Person{
    private Paar<Person, Person> eltern;

    public Kind(String name, int gebJahr, Paar<Person, Person> eltern) {
        super(name,gebJahr);
        this.eltern = eltern;
    }

    public Paar<Person, Person> getEltern() {
        return this.eltern;
    }

    public void setEltern(Person m, Person n) {
        this.eltern = new Paar<Person, Person>(m,n);
    }

    public static boolean geschwister(Kind a, Kind b) {
        return a.getEltern().equals(b.getEltern());
    }
}
