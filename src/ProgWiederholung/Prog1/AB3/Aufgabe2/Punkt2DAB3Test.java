package ProgWiederholung.Prog1.AB3.Aufgabe2;

public class Punkt2DAB3Test {
    public static void main(String[] args) {
        Punkt2DAB3 p1 = new Punkt2DAB3(3.0, 4.0);
        Punkt2DAB3 p2 = new Punkt2DAB3(3.00005, 4.00005);
        Punkt2DAB3 p3 = new Punkt2DAB3(5.0, 6.0);

        // Test der statischen Methode
        System.out.println("areEqual(p1, p2): " + Punkt2DAB3.areEqual(p1, p2)); // true
        System.out.println("areEqual(p1, p3): " + Punkt2DAB3.areEqual(p1, p3)); // false

        // Test der equals()-Methode
        System.out.println("p1.equals(p2): " + p1.equals(p2)); // true
        System.out.println("p1.equals(p3): " + p1.equals(p3)); // false

        // Test der epsilon-Anpassung
        Punkt2DAB3.setEpsilon(0.000001);
        System.out.println("areEqual(p1, p2) nach ε-Änderung: " + Punkt2DAB3.areEqual(p1, p2)); // false
    }
}
