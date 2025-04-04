package Prog1.AB2.Aufgabe1;

public class KontoTest {

    public static void testErstellenUndAusgeben() {
        Konto konto = new Konto("Max Mustermann", 123456);
        System.out.println(konto);
    }

    public static void testEinzahlenUndAbheben() {
        Konto konto = new Konto("Anna Schmidt", 654321);
        System.out.println("Nach Einzahlung: " + konto.einzahlen(1000.00));
        System.out.println("Nach Abhebung: " + konto.auszahlen(200.00));
    }

    public static void testMehrereKonten() {
        Konto konto1 = new Konto("Lukas Meier", 111111);
        Konto konto2 = new Konto("Sarah Lehmann", 222222);

        konto1.einzahlen(500.00);
        konto2.einzahlen(1500.00);
        konto1.auszahlen(100.00);
        konto2.auszahlen(300.00);
        konto1.einzahlen(200.00);
        konto2.auszahlen(400.00);

        System.out.println(konto1);
        System.out.println(konto2);
    }

    public static void main(String[] args) {
        testErstellenUndAusgeben();
        testEinzahlenUndAbheben();
        testMehrereKonten();
    }
}

