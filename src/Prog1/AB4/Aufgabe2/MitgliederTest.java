package Prog1.AB4.Aufgabe2;

public class MitgliederTest {
    public static void main(String[] args) {
        Mitglieder m1 = new Mitglieder("Anna");
        Mitglieder m2 = new Mitglieder("Ben");
        Mitglieder m3 = new Mitglieder("Clara");

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        m1.zahlen();
        m2.zahlen();

        System.out.println("\nNach Zahlungen:");
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        System.out.println("\nGesamtsumme der Beiträge: " + Mitglieder.getSumme() + " €");

        Mitglieder.setBeitrag(120);
        m3.zahlen();
        System.out.println("\nNach Beitragserhöhung und Zahlung von Clara:");
        System.out.println(m3);
        System.out.println("Gesamtsumme der Beiträge: " + Mitglieder.getSumme() + " €");
    }
}

