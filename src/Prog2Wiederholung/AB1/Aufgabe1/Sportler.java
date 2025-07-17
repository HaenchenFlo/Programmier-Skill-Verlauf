package Prog2Wiederholung.AB1.Aufgabe1;

public abstract class Sportler extends Person {
    private int groesse;
    public double gewicht;

    public Sportler(String name, int gebJahr, int groesse, double gewicht) {
        super(name, gebJahr);
        this.groesse = groesse;
        this.gewicht = gewicht;
    }

    public int getGroesse() {
        return this.groesse;
    }

    public double getGewicht() {
        return this.gewicht;
    }

    public abstract String info();

    @Override
    public String toString() {
        return super.toString() + " | Größe: " + groesse + " cm | Gewicht: " + gewicht + " kg | Info: " + info();
    }

    public boolean equals(Object o) {
        if(!(this.getClass().equals(o.getClass()))) return false;

        Sportler anderePerson = (Sportler) o;
        return super.equals(o);
    }
}
