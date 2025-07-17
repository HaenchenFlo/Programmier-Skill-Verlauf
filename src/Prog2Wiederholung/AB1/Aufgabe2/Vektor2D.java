package Prog2Wiederholung.AB1.Aufgabe2;

public class Vektor2D extends Punkt2D implements Addierbar, Messbar {
    private double x;
    private double y;

    public Vektor2D() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Vektor2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vektor2D(Punkt2D d) {

    }

    public Vektor2D(Punkt2D e1, Punkt2D e2) {

    }



    @Override
    public Addierbar add(Addierbar a) {
        return null;
    }

    @Override
    public double laenge() {
        return 0;
    }

    @Override
    public void multiply(double d) {

    }

    @Override
    public void resize() {

    }
}
