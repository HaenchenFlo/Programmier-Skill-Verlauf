package Prog2.AB2.Aufgabe1;

public class PaarTest {
    public static void main(String[] args) {
        // Paare mit Integer und String
        Paar<Integer, String> p1 = new Paar<>(42, "Hallo");
        Paar<Integer, String> p2 = new Paar<>(42, "Hallo");
        Paar<Integer, String> p3 = new Paar<>(13, "Welt");

        // Paare mit Double und Boolean
        Paar<Double, Boolean> p4 = new Paar<>(3.14, true);
        Paar<Double, Boolean> p5 = new Paar<>(3.14, true);
        Paar<Double, Boolean> p6 = new Paar<>(2.71, false);

        // Ausgabe der Paare
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);
        System.out.println("p4: " + p4);
        System.out.println("p5: " + p5);
        System.out.println("p6: " + p6);

        // Vergleiche
        System.out.println("\nVergleiche:");
        System.out.println("p1 equals p2: " + p1.equals(p2)); // true
        System.out.println("p1 equals p3: " + p1.equals(p3)); // false
        System.out.println("p4 equals p5: " + p4.equals(p5)); // true
        System.out.println("p4 equals p6: " + p4.equals(p6)); // false
        System.out.println("p1 equals p4: " + p1.equals(p4)); // false (unterschiedlicher Typ)

        // Bearbeiten der Werte
        p3.setErstes(42);
        p3.setZweites("Hallo");

        System.out.println("\nNach dem Ändern von p3:");
        System.out.println("p3: " + p3);
        System.out.println("p1 equals p3: " + p1.equals(p3)); // jetzt true
    }
}
