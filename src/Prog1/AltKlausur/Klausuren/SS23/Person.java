package Prog1.AltKlausur.Klausuren.SS23;

public class Person {
    private String name;
    private int gebJahr;

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
