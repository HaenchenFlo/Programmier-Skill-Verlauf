package Prog2.AB2.Aufgabe2;

/**
 *
 * @author fhaenc2s
 *
 */

public class Person {

    private String name;
    private int gebJahr;

    public Person(String n, int g) {
        this.name = n;
        this.gebJahr = g;
    }

    public String name() {
        return this.name;
    }

    public int gebJahr() {
        return this.gebJahr;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.gebJahr + ")";
    }

    @Override
    public boolean equals(Object o) {
        if(!(this.getClass().equals(o.getClass()))) return false;

        Person anderePerson = (Person) o;
        return this.name.equals(anderePerson.name) && this.gebJahr == anderePerson.gebJahr;
    }
}

