package Prog1.AB11.Aufgabe2;

import java.util.Random;
import java.util.Scanner;

public class LottoSpiel {
    static Random r = new Random();
    private ArrayMenge ziehung;
    private ArrayMenge tipp;

    public LottoSpiel() {
        ziehung = new ArrayMenge();
        tipp = new ArrayMenge();
    }

    public Menge ziehen() {
        ziehung = new ArrayMenge();
        while (ziehung.size() < 6) {
            int zahl = r.nextInt(49) + 1;
            ziehung.insert(zahl);
        }
        return ziehung;
    }
    public void tippFix(int[] arr) {
        tipp = new ArrayMenge();
        for (int zahl : arr) {
            tipp.insert(zahl);
        }
    }

    public void tippZufall() {
        tipp = new ArrayMenge();
        while (tipp.size() < 6) {
            int zahl = r.nextInt(49) + 1;
            tipp.insert(zahl);
        }
    }

    public void tippEinlesen() {
        Scanner sc = new Scanner(System.in);
        tipp = new ArrayMenge();
        System.out.println("Bitte 6 verschiedene Zahlen (1 bis 49) eingeben:");
        while(tipp.size() < 6) {
            int zahl = sc.nextInt();
            if (zahl >= 1 && zahl <= 49 && !tipp.contains(zahl)) {
                tipp.insert(zahl);
            } else {
                System.out.println("Ungültige oder doppelte Zahl, nochmal:");
            }
        }
        sc.close();
    }

    public void bekanntGeben() {
        System.out.print("Gezogene Zahlen: ");
        int[] zArray = ((ArrayMenge) ziehung).toSortedArray();
        for (int z : zArray) {
            System.out.print(z + " ");
        }
        System.out.println();

        System.out.print("Ihr Tipp: ");
        int[] tArray = ((ArrayMenge) tipp).toSortedArray();
        for (int t : tArray) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public int auswerten() {
        int treffer = 0;
        for(int i = 0; i <= 49; i++) {
            if(tipp.contains(i) && ziehung.contains(i)) {
                treffer++;
            }
        }
        return treffer;
    }
}
