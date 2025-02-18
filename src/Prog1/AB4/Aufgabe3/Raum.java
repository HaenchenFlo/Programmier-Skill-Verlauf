package Prog1.AB4.Aufgabe3;



public class Raum {
    public int raumNummer;
    public static int neueRaumNummer = 0;
    public int anzahlPlaetze;
    public Person isGebucht;

    //Konstruktor
    public Raum(int anzahlPlaetze) {
        this.raumNummer = neueRaumNummer++;
        this.anzahlPlaetze = anzahlPlaetze;
    }
    //Setter und getter


    //Methoden


    public void freigeben() {

    }
}
