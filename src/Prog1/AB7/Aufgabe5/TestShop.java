package Prog1.AB7.Aufgabe5;

public class TestShop {
    public static void main(String[] args) {
        // Artikel erzeugen
        Artikel a1 = new Artikel("Hose", 39.99);
        Artikel a2 = new Artikel("T-Shirt", 19.99);
        Artikel a3 = new Artikel("Jacke", 79.90);
        Artikel a4 = new Artikel("Mütze", 9.99);
        Artikel a5 = new Artikel("Socken", 4.50);
        Artikel a6 = new Artikel("Schuhe", 59.95);
        Artikel a7 = new Artikel("Gürtel", 14.00);
        Artikel a8 = new Artikel("Pullover", 29.95);
        Artikel a9 = new Artikel("Hemd", 24.99);

        // Zwei Kunden erzeugen
        Kunde kunde1 = new Kunde("Alice");
        Kunde kunde2 = new Kunde("Bob");

        // Kunde 1 legt 7 Artikel in den Warenkorb
        kunde1.inWarenkorbLegen(a1);
        kunde1.inWarenkorbLegen(a2);
        kunde1.inWarenkorbLegen(a3);
        kunde1.inWarenkorbLegen(a4);
        kunde1.inWarenkorbLegen(a5);
        kunde1.inWarenkorbLegen(a6);
        kunde1.inWarenkorbLegen(a7);

        // Kunde 2 legt 2 Artikel in den Warenkorb
        kunde2.inWarenkorbLegen(a8);
        kunde2.inWarenkorbLegen(a9);

        // Kunde 1 legt noch einen Artikel
        kunde1.inWarenkorbLegen(a9);

        // Beide zeigen ihren Warenkorb
        System.out.println();
        kunde1.zeigeWarenkorb();
        System.out.println();
        kunde2.zeigeWarenkorb();

        // Beide kaufen
        System.out.println("\n--- Kaufvorgänge ---");
        double summe1 = kunde1.kaufen();
        System.out.printf("Gesamtbetrag von Kunde 1: %.2f EUR%n", summe1);

        double summe2 = kunde2.kaufen();
        System.out.printf("Gesamtbetrag von Kunde 2: %.2f EUR%n", summe2);
    }
}
