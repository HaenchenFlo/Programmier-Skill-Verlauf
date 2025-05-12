package Prog1.AB6.Aufgabe4;

import java.util.Scanner;

public class Spiel {
    public static void simplesSpiel(Spieler sp1, Spieler sp2) {
        Scanner sc = new Scanner(System.in);
        String antwort = "j";
        while(antwort.equals("j")) {
            int sp1erg = sp1.wuerfeln();
            int sp2erg = sp2.wuerfeln();

            if(sp1erg > sp2erg) {
                sp1.punktPlus();
            } else if (sp2erg > sp1erg) {
                sp2.punktPlus();
            }
            System.out.println("Spieler " + sp1.getName() + " Wurfergebnis: " + sp1erg + ", Spieler " + sp2.getName() + " Wurfergebnis : " + sp2erg);
            System.out.print("Weiter? (j/n)");
            antwort = sc.nextLine();
        }
        System.out.println("Spieler " + sp1.getName() + " Punktzahl: " + sp1.punkte() + " ------ Spieler " + sp2.getName() + " Punktzahl: " + sp2.punkte());
        sc.close();
    }

    public static void filzlaus(Spieler sp1, Spieler sp2) {
        int versuchesp1 = 0;
        int versuchesp2 = 0;
        boolean sp1hateins = false;
        boolean sp2hateins = false;

        while(versuchesp1 < 9 && !sp1hateins) {
            versuchesp1++;
            int wurf = sp1.wuerfeln();
            if(wurf == 1) {
                sp1.punktPlus(versuchesp1);
                sp1hateins = true;
            }
        }

        while(versuchesp2 < 9 && !sp2hateins) {
            versuchesp2++;
            int wurf = sp2.wuerfeln();
            if(wurf == 1) {
                sp2.punktPlus(versuchesp2);
                sp2hateins = true;
            }
        }


        if (sp1.punkte() == 0 && sp2.punkte() == 0) {
            System.out.println("Beide Spieler haben keine 1 gewürfelt. Beide haben verloren!");
            return;
        }

        if (sp1.punkte() == 0) {
            System.out.println("Spieler " + sp1.getName() + " hat keine 1 gewürfelt und verliert.");
            System.out.println("Spieler " + sp2.getName() + " gewinnt!");
            return;
        }

        if (sp2.punkte() == 0) {
            System.out.println("Spieler " + sp2.getName() + " hat keine 1 gewürfelt und verliert.");
            System.out.println("Spieler " + sp1.getName() + " gewinnt!");
            return;
        }

        if(sp1.punkte() < sp2.punkte()) {
            System.out.println("Spieler " + sp1.getName() + " hat mit " + sp1.punkte() + " punkten gewonnen!");
        } else {
            System.out.println("Spieler " + sp2.getName() + " hat mit " + sp2.punkte() + " punkten gewonnen!");
        }
    }

    public static void sechser(Spieler sp1, Spieler sp2) {
        int versucheSp1 = 0;
        int versucheSp2 = 0;
        boolean sp1hatpasch = false;
        boolean sp2hatpasch = false;

        while(!sp1hatpasch) {
            int w1 = sp1.wuerfeln();
            int w2 = sp1.wuerfeln();
            versucheSp1++;
            if(w1 == 6 && w2 == 6) {
                sp1.punktPlus(versucheSp1);
                sp1hatpasch = true;
            }
        }

        while(!sp2hatpasch) {
            int w3 = sp2.wuerfeln();
            int w4 = sp2.wuerfeln();
            versucheSp2++;
            if(w3 == 6 && w4 == 6) {
                sp2.punktPlus(versucheSp2);
                sp2hatpasch = true;
            }
        }

        System.out.println(sp1.getName() + " hat den 6er-Pasch nach " + sp1.punkte() + " Versuchen.");
        System.out.println(sp2.getName() + " hat den 6er-Pasch nach " + sp2.punkte() + " Versuchen.");

        if(sp1.punkte() < sp2.punkte()) {
            System.out.println("Spieler " + sp1.getName() + " hat mit " + sp1.punkte() + " punkten gewonnen!");
        } else if(sp2.punkte() < sp1.punkte()) {
            System.out.println("Spieler " + sp2.getName() + " hat mit " + sp2.punkte() + " punkten gewonnen!");
        } else {
            System.out.println("Unentschieden!");
        }
    }
}
