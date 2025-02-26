package Prog1.AB5.Aufgabe3;

public class RationalTest {
    public static void main(String[] args) {
        // Test 1: Erzeugen von Brüchen
        Rational bruch1 = new Rational(3, 4);
        Rational bruch2 = new Rational(5, 6);
        Rational bruch3 = new Rational(2);  // Sollte 2/1 sein
        Rational bruch4 = new Rational(0, 7);  // Sollte 0/1 sein

        System.out.println("Bruch 1: " + bruch1);
        System.out.println("Bruch 2: " + bruch2);
        System.out.println("Bruch 3: " + bruch3);
        System.out.println("Bruch 4: " + bruch4);

        // Test 2: Addition
        bruch1.addition(bruch2);
        System.out.println("Nach Addition (3/4 + 5/6): " + bruch1);

        // Test 3: Subtraktion
        bruch1.subtraction(bruch2);
        System.out.println("Nach Subtraktion (Ergebnis - 5/6): " + bruch1);

        // Test 4: Multiplikation
        bruch1.multiplication(bruch2);
        System.out.println("Nach Multiplikation mit 5/6: " + bruch1);

        // Test 5: Division
        bruch1.division(bruch2);
        System.out.println("Nach Division durch 5/6: " + bruch1);

        // Test 6: Kehrwert
        bruch3.kehrwert();
        System.out.println("Kehrwert von 2/1: " + bruch3);

        // Test 7: Umwandlung in Gleitkommazahl
        System.out.println("Bruch 3 als Gleitkommazahl: " + bruch3.gleitzahl());

        // Test 8: Gleichheit von Brüchen
        Rational bruch5 = new Rational(6, 8);// Sollte gekürzt 3/4 sein
        Rational bruch8 = new Rational(1, 4);
        System.out.println("Gleichheit von 3/4 und 6/8: " + bruch1.gleichheit(bruch5));
        System.out.println("Gleichheit von 1/4 und 6/8: " + bruch8.gleichheit(bruch5));

        // Test 9: Sonderfälle
        Rational bruch6 = new Rational(0, 3); // 0/1 nach Kürzen
        Rational bruch7 = new Rational(1, 0); // Sollte nicht erlaubt sein (Fehlermeldung oder Exception nötig)

        System.out.println("Bruch 6: " + bruch6);
        System.out.println("Bruch 7: " + bruch7);  // Falls erlaubt, prüfen was passiert
    }
}
