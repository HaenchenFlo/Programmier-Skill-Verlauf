package Prog1.AB7.Aufgabe3;

import java.util.Random;

public class Spiel {
    private Spieler[] teilnehmerFeld;


    public static int[] highscore = new int[11];


    public Spiel(Spieler[] teilnehmerFeld) {
        this.teilnehmerFeld = teilnehmerFeld;
    }

    public void spielen(int anzahlRunden) {
        for(int i = 0; i < anzahlRunden; i++) {
            spielrunden();
        }
    }

    private void spielrunden() {
        Random rand = new Random();
        for(int i = 0; i < teilnehmerFeld.length; i++) {
            Spieler spieler = teilnehmerFeld[i];
            int x = rand.nextInt(100);
            Ergebnis ergebnis = new Ergebnis(spieler, x);

            System.out.println("Spieler: " + spieler + " hat das Ergebnis: " + ergebnis  + " erziehlt");

            eintragen(ergebnis);
        }
    }

    private void eintragen(Ergebnis ergebnis) {

    }



    private void ausgabe() {
        for(int i = 0; i < highscore.length - 1; i++) {
            System.out.println(highscore[i]);
        }
    }
}
