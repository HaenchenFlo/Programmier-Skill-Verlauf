package Prog1.AB10.Aufgabe2;

public class TestQuadratischeGleichung {
    public static void main(String[] args) {
        try {
            double[] loesungen = QuadratischeGleichung.loeseQuadrGlchg(1, -3, 2); // x² - 3x + 2 = 0
            System.out.printf("Lösungen: x1 = %.2f, x2 = %.2f%n", loesungen[0], loesungen[1]);
        } catch (QuadrGlchgException e) {
            System.out.println("Fehler: " + e.getMessage());
        }

        try {
            double[] loesungen = QuadratischeGleichung.loeseQuadrGlchg(1, 2, 1); // Diskriminante = 0
        } catch (QuadrGlchgException e) {
            System.out.println("Fehler: " + e.getMessage());
        }

        try {
            double[] loesungen = QuadratischeGleichung.loeseQuadrGlchg(0, 2, 1); // a = 0, nicht quadratisch
        } catch (QuadrGlchgException e) {
            System.out.println("Fehler: " + e.getMessage());
        }
    }
}

