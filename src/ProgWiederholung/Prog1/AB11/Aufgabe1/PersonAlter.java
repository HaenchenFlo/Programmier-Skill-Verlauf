package ProgWiederholung.Prog1.AB11.Aufgabe1;

public class PersonAlter extends Person implements Vergleichbar {
    public PersonAlter(String n, int geb) {
        super(n,geb);
    }

    @Override
    public boolean kleiner(Object o) {
        Person other = (Person) o;
        if(this.gebJahr() > other.gebJahr()) {
            return true;
        }
        return false;
    }
}
