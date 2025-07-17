package ProgWiederholung.Prog1.AB11.Aufgabe1;

public class Person {
    private String name;
    private int gebJahr;
    private int gebTag;
    private int gebMonat;

    public Person(String name, int gebJahr) {
        this.name = name;
        this.gebJahr = gebJahr;
    }

    public String name() {
        return name;
    }

    public int gebJahr() {
        return gebJahr;
    }

}
