package Prog1.AB3.Aufgabe2;

public class BuehneTest {
    public static void main(String[] args) {
        // Bühne 1 erstellen
        Buehne rockStage = new Buehne(59.90);
        // Bühne 2 erstellen
        Buehne elektroZelt = new Buehne(39.50);
        // Bühne 3 erstellen
        Buehne jazzLounge = new Buehne(45.00);
        // Falsche Ticket Eingabe
        Buehne falschTest = new Buehne(10);
        // Tickets verkaufen
        rockStage.ticketVerkauf(100);
        elektroZelt.ticketVerkauf(50);
        jazzLounge.ticketVerkauf(30);
        elektroZelt.ticketVerkauf(25);  // weitere Verkäufe auf derselben Bühne
        falschTest.ticketVerkauf(-5);
        // Ausgabe
        System.out.println("Rock Stage: " + rockStage.getAnzahlTickets() + " Tickets verkauft.");
        System.out.println("Elektro Zelt: " + elektroZelt.getAnzahlTickets() + " Tickets verkauft.");
        System.out.println("Jazz Lounge: " + jazzLounge.getAnzahlTickets() + " Tickets verkauft.");
        System.out.println("Falschtest mit -5 Tickets (Sollte 0 sein): " + falschTest.getAnzahlTickets() + " Tickets verkauft.");
    }
}
