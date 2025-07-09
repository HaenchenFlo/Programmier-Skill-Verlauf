package Prog1.AltKlausur.Klausuren.SS23;

public class Aufgabe5Test {
    public static void main(String[] args) {
        Inaktiv a = new Inaktiv("Florian", 2003);
        Inaktiv b = new Inaktiv("Gabriel", 2000);

        Aktiv c = new Aktiv("Hannah", 2006);
        Aktiv d = new Aktiv("Stefan", 1960);


        c.arbeiten(5);
        c.arbeiten(3);

        a.spenden(100.0);

        System.out.println(a.beitrag());
        System.out.println(b.beitrag());
        System.out.println(c.beitrag());
        System.out.println(d.beitrag());
    }
}
