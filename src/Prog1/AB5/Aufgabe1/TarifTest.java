package Prog1.AB5.Aufgabe1;

public class TarifTest {

    public static void main(String[] args) {
        Tarif f = new Tarif(30,0.12);
        f.telefonieren(40);
        f.telefonieren(30);
        System.out.println(f.rechnung());
        f.telefonieren(40);
        System.out.println(f.rechnung());
        f.telefonieren(20);
        System.out.println(f.rechnung());
        Tarif.setGrundGebuer(40);
        f.telefonieren(20);
        System.out.println(f.rechnung());
    }
}

