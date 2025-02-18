package Prog1.AB4.Aufgabe2;

public class SpielerTest {
    public static void main(String[] args) {
        Spieler a = new Spieler("Anna");
        Spieler b = new Spieler("Otto");
        b.spiel(true);
        a.spiel(true);
        a.spiel(true);
        b.spiel(false);
        a.spiel(true);
        a.spiel(true);
        b.spiel(true);
        a.spiel(false);
        b.spiel(false);
        a.spiel(false);
        a.spiel(true);
        a.spiel(true);
        a.zeigeBilanz();
        System.out.println();
        b.zeigeBilanz();
    }
}
