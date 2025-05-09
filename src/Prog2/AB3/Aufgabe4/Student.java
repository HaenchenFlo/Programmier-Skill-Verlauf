package Prog2.AB3.Aufgabe4;

public class Student {
    private String name;
    private int matNr;
    private static int alleMatr = 100;


    public Student(String name, int gebJahr) {
        this.name = name;
        this.matNr = alleMatr;
        alleMatr++;
    }

    public int getMatNr() {
        return this.matNr;
    }

    public void anmelden(Modul m) {
        m.anmelden(this);
    }

    public void abmelden(Modul m) {
        m.abmelden(this);
    }


    @Override
    public String toString() {
        return "Matrikelnummer: " + this.matNr + ", Name: " + this.name;
    }

    public boolean equals(Object o) {
        if(!(this.getClass().equals(o.getClass()))) return false;

        Student anderePerson = (Student) o;
        return this.matNr == anderePerson.matNr;
    }
}
