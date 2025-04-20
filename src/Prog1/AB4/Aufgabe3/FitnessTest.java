package Prog1.AB4.Aufgabe3;

public class FitnessTest {
    public static void main(String[] args) {
        Kurs yoga = new Kurs("Yoga", 30);
        Kurs fitness = new Kurs("Fitness", 50);

        Member anna = new Member("Anna");
        Member tom = new Member("Tom");

        anna.buchen(yoga);
        anna.buchen(fitness);

        tom.buchen(yoga);

        System.out.println(anna);
        System.out.println("Anna besucht " + anna.getKursAnzahl() + " Kurse.");
        System.out.println("Anna zahlt monatlich: " + anna.monatsRechnung() + " Euro.");

        System.out.println("\n------------------------------\n");

        System.out.println(tom);
        System.out.println("Tom besucht " + tom.getKursAnzahl() + " Kurse.");
        System.out.println("Tom zahlt monatlich: " + tom.monatsRechnung() + " Euro.");

        System.out.println("\n------------------------------\n");

        System.out.println("Gesamteinnahmen aller Kurse: " + Kurs.getGesamtEinnahmen() + " Euro.");

        System.out.println("\n------------------------------\n");

        System.out.println("Teilnehmer im Yoga: " + yoga.getKursTeilnehmer());
        System.out.println("Teilnehmer im Fitness: " + fitness.getKursTeilnehmer());
    }
}
