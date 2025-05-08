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
}
