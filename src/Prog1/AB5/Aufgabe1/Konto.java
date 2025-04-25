package Prog1.AB5.Aufgabe1;

import Prog1.AB2.Aufgabe2.Person;

public class Konto {
    private Person kontoInhaber;
    private int kontoNummer;
    private double kontoStand;

    private static int letzteKonto = 1000;
    private static double gebuehr = 0.12;
    public static double gesamtGebueren = 0.0;

    private int bewegungenGesamt = 0;
    private int bewegungenMitAlterGebuehr = 0;
    private double letzteGebuehr = gebuehr;

    public Konto(Person kontoInhaber) {
        this.kontoInhaber = kontoInhaber;
        this.kontoNummer = letzteKonto++;
        this.kontoStand = 0.0;
    }

    public static void setGebuehr(double neu) {
        gebuehr = neu;
    }

    public void einzahlen(double betrag) {
        if (betrag > 0) {
            kontoStand += betrag - gebuehr;
            gesamtGebueren += gebuehr;
            bewegungenGesamt++;
            if (letzteGebuehr == gebuehr) {
                bewegungenMitAlterGebuehr++;
            }
        } else {
            System.out.println("Negativer Betrag nicht möglich!");
        }
    }

    public void abheben(double betrag) {
        if (betrag < 0) {
            System.out.println("Negativer Betrag nicht möglich!");
            return;
        }
        if (betrag + gebuehr > kontoStand) {
            System.out.println("Auszahlung nicht möglich");
            return;
        }
        kontoStand -= betrag + gebuehr;
        gesamtGebueren += gebuehr;
        bewegungenGesamt++;
        if (letzteGebuehr == gebuehr) {
            bewegungenMitAlterGebuehr++;
        }
    }

    public void ueberweisen(Konto konto, double betrag) {
        if (betrag < 0) {
            System.out.println("Negativer Betrag nicht möglich!");
            return;
        }
        if (betrag + gebuehr > this.kontoStand) {
            System.out.println("Auszahlung nicht möglich");
            return;
        }
        this.abheben(betrag);
        konto.einzahlen(betrag + gebuehr);
    }

    public String toString() {
        return "Name: " + kontoInhaber.getName() + ", Kontonummer: " + kontoNummer + ", Kontostand: " + kontoStand;
    }

    public void kontoauszug() {
        System.out.println(toString());
    }

    public double abschlussRechnung() {
        int bewegungenMitNeuerGebuehr = bewegungenGesamt - bewegungenMitAlterGebuehr;
        double summe = (bewegungenMitAlterGebuehr * letzteGebuehr) + (bewegungenMitNeuerGebuehr * gebuehr);

        bewegungenGesamt = 0;
        bewegungenMitAlterGebuehr = 0;
        letzteGebuehr = gebuehr;


        return summe;
    }
}
