package Prog1.AB5.Aufgabe3;

public class Rational {
    private int zaehler; //Obere Zahl
    private int nenner; // Untere Zahl



    //Konstruktor
    public Rational(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    public Rational(int zaehler) {
        this.zaehler = zaehler;
        this.nenner = 1;
    }

    //Methoden

    private int ggT(int a, int b) {
        while(b != 0) {
            int rest = a % b;
            a = b;
            b = rest;
        }
        return Math.abs(a);
    }

    public void kuerzen() {
        if(this.zaehler == 0) {
            this.nenner = 1;
            return;
        }
        int ggT = ggT(this.zaehler, this.nenner);
        this.zaehler /= ggT;
        this.nenner /= ggT;

        if(this.zaehler < 0) {
            this.zaehler = -this.zaehler;
            this.nenner = -this.nenner;
        }
    }

    public void kehrwert() {
        if (this.zaehler == 0) {
            this.nenner = 1;
            return;
        }

        // Zähler und Nenner tauschen
        int temp = this.zaehler;
        this.zaehler = this.nenner;
        this.nenner = temp;
    }

    //Instanzmethoden

    public void addition(Rational r) {
        int neuerZaehler = this.zaehler * r.nenner + r.zaehler * this.nenner;
        int neuerNenner = this.nenner * r.nenner;

        this.zaehler = neuerZaehler;
        this.nenner = neuerNenner;

        kuerzen();
    }

    public void subtraction(Rational r) {
        int neuerZaehler = this.zaehler * r.nenner - r.zaehler * this.nenner;
        int neuerNenner = this.nenner * r.nenner;

        this.zaehler = neuerZaehler;
        this.nenner = neuerNenner;

        kuerzen();
    }

    public void multiplication(Rational r) {
        int neuerZaehler = this.zaehler * r.zaehler;
        int neuerNenner = this.nenner * r.nenner;

        this.zaehler = neuerZaehler;
        this.nenner = neuerNenner;

        kuerzen();
    }

    public void division(Rational r) {
        r.kehrwert();

        int neuerZaehler = this.zaehler * r.zaehler;
        int neuerNenner = this.nenner * r.nenner;

        this.zaehler = neuerZaehler;
        this.nenner = neuerNenner;

        kuerzen();
    }

    //Klassenmethoden


    public String toString() {
        if(this.zaehler == 0) {
            return "0" + "/" + "1";
        }
        if(this.nenner == 1) {
            return this.zaehler + "";
        }
        return this.zaehler + "/" + this.nenner;
    }

    public double gleitzahl() {
        return (double) this.zaehler / this.nenner;
    }

    public boolean gleichheit(Rational r) {
        this.kuerzen();
        r.kuerzen();
        return this.zaehler == r.zaehler && this.nenner == r.nenner;
    }
}
