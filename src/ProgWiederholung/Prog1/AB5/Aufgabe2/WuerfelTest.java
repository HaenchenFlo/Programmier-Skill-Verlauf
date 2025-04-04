package ProgWiederholung.Prog1.AB5.Aufgabe2;

public class WuerfelTest {
    public static void main(String[] args) {
        //Spieler 1
        Wuerfel spieler1W = new Wuerfel();
        Wuerfel spieler1W1 = new Wuerfel();
        //Spieler 2
        Wuerfel spieler2W = new Wuerfel();
        Wuerfel spieler2W1 = new Wuerfel();

        System.out.println("initialierTest Spieler 1 W1: " + spieler1W.getWert());
        System.out.println("initialierTest Spieler 1 W2: " + spieler1W1.getWert());
        System.out.println("initialierTest Spieler 2 W1: " + spieler2W.getWert());
        System.out.println("initialierTest Spieler 2 W2: " + spieler2W1.getWert());

        System.out.println();

        spieler1W.wuerfeln();
        spieler1W1.wuerfeln();
        //Würfel Werte
        System.out.println(spieler1W.getWert());
        System.out.println(spieler1W1.getWert());
        System.out.println(Wuerfel.pasch(spieler1W, spieler1W1));
        System.out.println();
        System.out.println();
        //Wuerfel SpielTest
        Wuerfel.spielen(spieler1W,spieler1W1,spieler2W,spieler2W1);
    }
}
