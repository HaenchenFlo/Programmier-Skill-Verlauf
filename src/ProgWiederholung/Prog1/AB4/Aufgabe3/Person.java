package ProgWiederholung.Prog1.AB4.Aufgabe3;
public class Person {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" + "Name='" + name + '\'' + '}';
    }
}

