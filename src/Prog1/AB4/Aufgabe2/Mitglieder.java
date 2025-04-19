package Prog1.AB4.Aufgabe2;

import java.beans.BeanInfo;

public class Mitglieder {
    private String name;
    private int nummer;
    private boolean hatBezahlt;

    private static int mitgliedNr = 1;
    private static int mitgliedBeitrag = 100;
    private static int beitragSumme = 0;

    public Mitglieder(String name) {
        this.name = name;
        this.nummer = mitgliedNr++;
        this.hatBezahlt = false;
    }

    public void zahlen() {
        if(!hatBezahlt) {
            beitragSumme += mitgliedBeitrag;
            hatBezahlt = true;
        }
    }

    public boolean hatGezahlt() {
        return hatBezahlt;
    }

    public String toString() {
        return "Name: " + name + ", Mitglieder Nummer: " + this.nummer
                + ", Beitrag gezahlt: " + (hatBezahlt ? "Ja" : "Nein");
    }

    public static void setBeitrag(int neu) {
        mitgliedBeitrag = neu;
    }

    public static int getSumme() {
        return beitragSumme;
    }
}
