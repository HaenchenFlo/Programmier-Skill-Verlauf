package Prog2.AB1.Aufgabe1;

public class Stud extends Person {
    private int matNr;
    private static int alleMatr = 100;


    public Stud(String name, int gebJahr) {
        super(name, gebJahr);
        this.matNr = alleMatr;
        alleMatr++;
    }

    public int getMatNr() {
        return this.matNr;
    }

    @Override
    public String toString() {
        return "Matrikelnummer: " + this.matNr + ", Name: " + this.name();
    }

    public boolean equals(Object o) {
        if(!(this.getClass().equals(o.getClass()))) return false;

        Stud anderePerson = (Stud) o;
        return this.matNr == anderePerson.matNr;
    }
}
