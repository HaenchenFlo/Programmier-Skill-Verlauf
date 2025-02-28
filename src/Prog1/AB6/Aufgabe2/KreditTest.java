package Prog1.AB6.Aufgabe2;

public class KreditTest {
    public static void main(String[] args) {

        System.out.println("Testfall 1: Kredit über 10.000€, Rate 1.000€");
        Kredit kredit1 = new Kredit(10000, 1000);
        kredit1.tilgungsPlan();

        System.out.println("\n------------------------------\n");

        System.out.println("Testfall 1: Kredit über 10.000€, Rate 1.000€ und Zinssatz 5 Prozent");
        Kredit kredit3 = new Kredit(10000, 1000);
        Kredit.setP(5.0); // Ändert den Zinssatz für alle neuen Kredite
        kredit3.tilgungsPlan();

    }
}
