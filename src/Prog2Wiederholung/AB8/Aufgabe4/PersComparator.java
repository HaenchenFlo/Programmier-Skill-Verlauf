package Prog2Wiederholung.AB8.Aufgabe4;

import Prog2Wiederholung.AB1.Aufgabe1.Person;

import java.util.Comparator;

public class PersComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int vergleichName = o1.name().compareTo(o2.name());
        if(vergleichName != 0) {
            return vergleichName;
        }
        return Integer.compare(o1.gebJahr(), o2.gebJahr());
    }
}
