package Prog1.AB9.Aufgabe4;

public abstract class Wesen {
    public String name;
    public int alter;

    public Wesen(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public abstract boolean lebendig();

    public abstract String gruss();

    public String toString() {
        return "Name: " + name + ", Alter: " + alter;
    }
}
