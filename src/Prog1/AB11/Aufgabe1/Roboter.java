package Prog1.AB11.Aufgabe1;

import Prog1.AB7.Aufgabe2.Punkt;

public class Roboter implements Beweglich {

    private Punkt standort;

    public Roboter() {
        this.standort = new Punkt();
    }


    @Override
    public Punkt position() {
        return this.standort;
    }

    @Override
    public void moveTo(Punkt p) {
        this.standort = p;
    }
}
