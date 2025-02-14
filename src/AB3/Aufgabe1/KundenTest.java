package AB3.Aufgabe1;

public class KundenTest {
    public static void main(String[] args) {
        System.out.println("Erstelle Kunden...");
        Kunde k1 = new Kunde("Florian");
        Kunde k2 = new Kunde("Marco");
        Kunde k3 = new Kunde("Marcel");
        Kunde k4 = new Kunde("Alec");

        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);
        System.out.println(k4);

        System.out.println("Anzahl der Kunden: " + Kunde.anzahlKunden());
    }
}
