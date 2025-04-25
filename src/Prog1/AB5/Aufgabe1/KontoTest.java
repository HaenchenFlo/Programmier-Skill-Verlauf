package Prog1.AB5.Aufgabe1;

import Prog1.AB2.Aufgabe2.Person;

public class KontoTest {
    public static void main(String[] args) {
        // Drei Personen erstellen
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        p1.name = "Anna";
        p2.name = "Florian";
        p3.name = "Alec";

        // Drei Konten erstellen
        Konto k1 = new Konto(p1);
        Konto k2 = new Konto(p2);
        Konto k3 = new Konto(p3);

        // Kontobewegungen durchführen mit Auszügen
        k1.einzahlen(100);
        k1.kontoauszug();

        k1.abheben(20);
        k1.kontoauszug();

        k2.einzahlen(200);
        k2.kontoauszug();

        k2.abheben(50);
        k2.kontoauszug();

        k3.einzahlen(300);
        k3.kontoauszug();

        // Überweisung von Konto 1 auf Konto 2
        k1.ueberweisen(k2, 30);
        System.out.println("\nNach Überweisung:");
        k1.kontoauszug();
        k2.kontoauszug();

        // Gebühren erhöhen
        System.out.println("\nGebühren werden erhöht auf 0.20 Euro...");
        Konto.setGebuehr(0.20);

        // Weitere Bewegungen nach Gebührenerhöhung
        k1.abheben(10);
        k2.einzahlen(50);
        k3.abheben(100);

        // Abschlussrechnungen
        System.out.println("\nAbschlussrechnungen:");
        System.out.println("Konto 1 Gebühren: " + k1.abschlussRechnung() + " EUR");
        System.out.println("Konto 2 Gebühren: " + k2.abschlussRechnung() + " EUR");
        System.out.println("Konto 3 Gebühren: " + k3.abschlussRechnung() + " EUR");

        System.out.println("Gesamt Gebühren: " + Konto.gesamtGebueren);
    }
}

