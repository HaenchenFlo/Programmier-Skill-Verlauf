package Prog1.AB11.Aufgabe3;


import Prog1.AB9.Aufgabe4.Wesen;

public class Pferd extends Wesen implements Kaufbar {
    private double gewicht;
    private double preis;

    public Pferd(String name, double preis, int alter) {
        super(name,alter);
        this.gewicht = gewicht;
        this.preis = preis;
    }


    public double preis() {
        return preis;
    }

    @Override
    public boolean lebendig() {
        return true;
    }

    @Override
    public String gruss() {
        return "Hüa";
    }

    @Override
    public void nehmen(Tragbar d) {
        return;
    }
}

