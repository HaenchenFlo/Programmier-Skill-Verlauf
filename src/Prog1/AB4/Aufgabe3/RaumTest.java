package Prog1.AB4.Aufgabe3;

public class RaumTest {
    public static void main(String[] args) {
        // Erstellen von Personen
        Person anna = new Person("Anna");
        Person otto = new Person("Otto");

        // Erstellen von Räumen
        Raum raum1 = new Raum(10); // Raum mit 10 Plätzen
        Raum raum2 = new Raum(10);  // Raum mit 5 Plätzen
        Raum raum3 = new Raum(10);
        Raum raum4 = new Raum(10);

        // Test: Buchen eines Raums mit genügend Plätzen
        System.out.println("Test 1: Raum 1 buchen mit 5 Personen (Anna):");
        raum1.buchen(5, anna);
        System.out.println();

        // Test: Buchen eines Raums mit zu vielen Personen
        System.out.println("Test 2: Raum 2 buchen mit 10 Personen (Otto):");
        raum2.buchen(10, otto); // Sollte Fehler ausgeben
        System.out.println();

        // Test: Erneutes Buchen eines bereits belegten Raums
        System.out.println("Test 3: Raum 1 erneut buchen (Otto):");
        raum1.buchen(3, otto); // Sollte "Raum schon vergeben" ausgeben
        System.out.println();

        // Test: Freigeben eines belegten Raums
        System.out.println("Test 4: Raum 1 freigeben:");
        raum1.freigeben();
        System.out.println();

        // Test: Freigeben eines bereits freien Raums
        System.out.println("Test 5: Raum 1 erneut freigeben:");
        raum1.freigeben();
        System.out.println();

        System.out.println("Test 6: Raum 1 an Otto vergeben:");
        raum1.buchen(10, otto);

        raum1.freigeben();

        raum2.buchen(1, otto);
        raum1.freigeben();
        raum2.freigeben();
        raum3.freigeben();
        raum4.freigeben();

        raum1.buchen(10, otto);
        raum2.buchen(5, anna);

        System.out.println();
        System.out.println("Quotentest");

        System.out.println(Raum.getfreieRaeume());
        System.out.println();
        System.out.println("Die Auslastungsquote liegt bei: " + String.format("%.1f", Raum.getAuslastungsQuote()) + "%");

        raum1.freigeben();
        raum2.freigeben();
        raum3.freigeben();
        raum4.freigeben();
        System.out.println();

        System.out.println("Anzahl an freien Raeumen: " + Raum.getfreieRaeume());
        System.out.println("Die Auslastungsquote liegt bei: " + String.format("%.1f", Raum.getAuslastungsQuote()) + "%");

    }
}