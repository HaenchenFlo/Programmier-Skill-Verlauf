package Prog1.AB4.Aufgabe1;

public class PicknickTest {
    public static void main(String[] args) {
        // Körbe erstellen mit unterschiedlichen Mengen an Käse (in kg) und Wein (in Flaschen)
        PicknickKorb korb1 = new PicknickKorb(2.0, 3);   // 2kg Käse, 3 Flaschen Wein
        PicknickKorb korb2 = new PicknickKorb(1.5, 5);   // 1.5kg Käse, 5 Flaschen Wein
        PicknickKorb korb3 = new PicknickKorb(3.0, 2);   // 3kg Käse, 2 Flaschen Wein

        // Preise für die Körbe berechnen und ausgeben
        System.out.println("Preise der Körbe (vor Preisänderung):");
        System.out.println("Korb 1: " + korb1.berechneKorb() + " €");
        System.out.println("Korb 2: " + korb2.berechneKorb() + " €");
        System.out.println("Korb 3: " + korb3.berechneKorb() + " €");

        // Preis für Wein ändern
        PicknickKorb.setWeinPreis(7.50);// neue Preis für Wein (gilt für alle Körbe)
        PicknickKorb.setKaesePreis(20.5);

        // Preise für die Körbe nach Preisänderung berechnen und ausgeben
        System.out.println("\nPreise der Körbe (nach Preisänderung des Weins):");
        System.out.println("Korb 1: " + korb1.berechneKorb() + " €");
        System.out.println("Korb 2: " + korb2.berechneKorb() + " €");
        System.out.println("Korb 3: " + korb3.berechneKorb() + " €");
    }
}
