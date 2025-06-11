package Prog1.AB10.Aufgabe3;

import Prog1.AB7.Aufgabe2.Punkt;

public class RechteckTest {
    public static void main(String[] args) throws NichtPositivException {
        try {
            Punkt p = new Punkt();
            Rechteck r1 = new Rechteck(p,2.0,2.0,"blau");
            System.out.println("Rechteck erfolgreich erzeugt.");
            System.out.println("Umfang: " + r1.berechneUmfang());
            System.out.println("Fläche: " + r1.fInhalt());
        } catch (NichtPositivException e) {
            System.out.println("Fehler bei gültigem Rechteck: " + e.getMessage());
        }

        // Testfall 2: ungültige Werte (z.B. negative Länge)
        try {
            Punkt p2 = new Punkt(1, 1);
            Rechteck r2 = new Rechteck(p2, -4, 2, "rot");
            System.out.println("Dieses Rechteck hätte nicht erzeugt werden dürfen!");
        } catch (NichtPositivException e) {
            System.out.println("Erwarteter Fehler: " + e.getMessage());
        }

        // Testfall 3: ungültige Werte (z.B. Breite = 0)
        try {
            Punkt p3 = new Punkt(2, 2);
            Rechteck r3 = new Rechteck(p3, 4, 0, "grün");
            System.out.println("Dieses Rechteck hätte nicht erzeugt werden dürfen!");
        } catch (NichtPositivException e) {
            System.out.println("Erwarteter Fehler: " + e.getMessage());
        }
    }
}
