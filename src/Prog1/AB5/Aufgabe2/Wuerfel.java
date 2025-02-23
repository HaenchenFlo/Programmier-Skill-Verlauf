package Prog1.AB5.Aufgabe2;
import java.util.Random;

public class Wuerfel {
    Random rand = new Random();
    private int wert;

    public Wuerfel() {
        wuerfeln();
    }

    public int getWert() {
        return wert;
    }

    public int wuerfeln() {
        this.wert = rand.nextInt(6) + 1;
        return wert;
    }

    public static boolean pasch(Wuerfel w, Wuerfel w1) {
        return w.getWert() == w1.getWert();
    }

    public static void spielen(Wuerfel s1w, Wuerfel s1w1, Wuerfel s2w, Wuerfel s2w1) {
        s1w.wuerfeln();
        s1w1.wuerfeln();
        s2w.wuerfeln();
        s2w1.wuerfeln();
        int ergebnisS1= s1w.getWert() + s1w1.getWert();
        int ergebnisS2= s2w.getWert() + s2w1.getWert();
        boolean paschS1 = pasch(s1w, s1w1);
        boolean paschS2 = pasch(s2w, s2w1);

        if(paschS1 && !paschS2) {
            System.out.println("(" + s1w.getWert() + "," + s1w1.getWert() + ")"
                    + " gewinnt gegen " + "(" + s2w.getWert() + "," + s2w1.getWert() + ")");
            return;
        } else if(paschS2 && !paschS1) {
            System.out.println("(" + s2w.getWert() + "," + s2w1.getWert() + ")"
                    + " gewinnt gegen " + "(" + s1w.getWert() + "," + s1w1.getWert() + ")");
            return;
        }


        if (paschS1 && paschS2) {
            if(ergebnisS1 > ergebnisS2) {
                System.out.println("(" + s1w.getWert() + "," + s1w1.getWert() + ")"
                        + " gewinnt gegen " + "(" + s2w.getWert() + "," + s2w1.getWert() + ")");
                return;
            } else if (ergebnisS2 > ergebnisS1) {
                System.out.println("(" + s2w.getWert() + "," + s2w1.getWert() + ")"
                        + " gewinnt gegen " + "(" + s1w.getWert() + "," + s1w1.getWert() + ")");
                return;
            } else {
                System.out.println("(" + s1w.getWert() + "," + s1w1.getWert() + ")"
                        + " gegen " + "(" + s2w.getWert() + "," + s2w1.getWert() + "): unentschieden");
            }
        }

        if(ergebnisS1 > ergebnisS2) {
            System.out.println("(" + s1w.getWert() + "," + s1w1.getWert() + ")"
                    + " gewinnt gegen " + "(" + s2w.getWert() + "," + s2w1.getWert() + ")");
        } else if(ergebnisS2 > ergebnisS1) {
            System.out.println("(" + s2w.getWert() + "," + s2w1.getWert() + ")"
                    + " gewinnt gegen " + "(" + s1w.getWert() + "," + s1w1.getWert() + ")");
        } else {
            System.out.println("(" + s1w.getWert() + "," + s1w1.getWert() + ")"
                    + " gegen " + "(" + s2w.getWert() + "," + s2w1.getWert() + "): unentschieden");
        }
    }
}
