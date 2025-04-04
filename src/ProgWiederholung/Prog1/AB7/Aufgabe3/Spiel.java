package ProgWiederholung.Prog1.AB7.Aufgabe3;

import java.util.Random;

public class Spiel {
    private Spieler[] teilnehmerFeld;


    public static Ergebnis[] highscore = new Ergebnis[10];


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

            System.out.println(ergebnis  + " Punkte erziehlt");

            eintragen(ergebnis);
        }
    }

    private void eintragen(Ergebnis ergebnis) {
        //wenn highscore leer dann einfach eintragen
        if(highscore[0] == null) {
            highscore[0] = ergebnis;
            return;
        }
        int pos = -1;
        for(int i = 0; i < highscore.length - 1; i++) {
            if(highscore[i] == null || ergebnis.punkte() > highscore[i].punkte()) {
                pos = i;
                break;
            }
        }

        if(pos == -1) {
            return;
        }

        for(int i = highscore.length - 2; i >= pos; i--) {
            highscore[i + 1] = highscore[i];
        }

        highscore[pos] = ergebnis;
    }



    public static void ausgabe() {
        for(int i = 0; i < highscore.length - 1; i++) {
            if(highscore[i] != null) {
                System.out.println(highscore[i]);
            }
        }
    }
}
