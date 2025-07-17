package ProgWiederholung.Prog1.AB10.Aufgabe1_2;

public class BibliothekDemo {
    public static void main(String[] args) {
        Nutzer max = new Nutzer("Max", 2010);
        Nutzer anna = new Nutzer("Anna", 2000);

        DVD dvd1 = new DVD("Horrorfilm", 18);
        DVD dvd2 = new DVD("Kinderfilm", 6);
        Buch buch = new Buch("Java für Einsteiger");

        // 1. Nutzer zu jung für DVD
        try {
            max.ausleihen(dvd1);
        } catch (BibException e) {
            System.out.println("Fehler: " + e.getMessage());
        }

        // 2. Medium bereits ausgeliehen
        try {
            anna.ausleihen(dvd2); // erfolgreich
            max.ausleihen(dvd2);  // schon ausgeliehen
        } catch (BibException e) {
            System.out.println("Fehler: " + e.getMessage());
        }

        // 3. Nutzer hat schon 10 Medien
        try {
            for (int i = 0; i < 10; i++) {
                max.ausleihen(new Buch("Buch " + i));
            }
            max.ausleihen(buch); // sollte fehlschlagen
        } catch (BibException e) {
            System.out.println("Fehler: " + e.getMessage());
        }
    }
}
