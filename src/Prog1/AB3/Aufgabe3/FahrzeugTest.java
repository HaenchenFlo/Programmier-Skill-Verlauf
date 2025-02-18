package Prog1.AB3.Aufgabe3;

public class FahrzeugTest {
    public static void main(String[] args) {
        Fahrzeug f = new Fahrzeug("EMS FH 189");

        System.out.println("Fahrzeuge...");
        System.out.println(f.toString());

        System.out.println("Fahrzeug1 Rechnung:");
        System.out.println(f.rechnung(2,100));

        System.out.println();

        Fahrzeug f2 = new Fahrzeug("EMS FH 189", 30.0, 0.15);
        System.out.println(f2.toString());
        f2.setTagesPreis(30.0);
        f2.setKmPreis(0.15);
        System.out.println(f2.rechnung(1,60));
        System.out.println("Gesamteinnahmen bis jetzt: " + Fahrzeug.getGesamtEinnahmen()  + "€");

        System.out.println();

        Fahrzeug.setVersGeb(25.00);
        System.out.println("Neue Versicherung: " + Fahrzeug.getVersGeb());
        System.out.println("Gesamteinnahmen bis jetzt: " + Fahrzeug.getGesamtEinnahmen()  + "€");

        System.out.println();

        f.rechnung(1, 50);
        System.out.println("Fahrzeug1 wird nochmal vermietet");
        System.out.println("Gesamteinnahmen gesamt: " + Fahrzeug.getGesamtEinnahmen()  + "€");

    }
}
