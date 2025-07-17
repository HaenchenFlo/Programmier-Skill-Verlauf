package ProgWiederholung.Prog1.AB10.Aufgabe1_2;

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

    public int getAlter() {
        return 2025 - gebJahr;
    }

}
