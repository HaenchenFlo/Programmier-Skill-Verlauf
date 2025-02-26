package Prog1.AB5.Aufgabe3;

public class Rational {
    private int zaehler; //Obere Zahl
    private int nenner; // Untere Zahl
    private int ggT;


    //Konstruktor
    public Rational(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    public Rational(int zaehler) {
        this.zaehler = zaehler;
        this.nenner = 1;
    }

    public void kuerzen(int zaehler, int nenner) {
        if(zaehler == 0) {
            this.nenner = 1;
            return;
        }

    }
}
