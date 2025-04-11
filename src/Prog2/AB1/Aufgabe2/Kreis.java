package Prog2.AB1.Aufgabe2;

public class Kreis extends GeoObjekt2D {
    private double radius;
    private Punkt2D mittelpunkt;
    private final double pi = Math.PI;

    public Kreis(double radius, Punkt2D mittelpunkt) {
        this.radius = Math.abs(radius);
        this.mittelpunkt = mittelpunkt;
    }

    public Punkt2D mittelpunkt() {
        return this.mittelpunkt;
    }

    public double radius() {
        return this.radius;
    }


    @Override
    public double umfang() {
        return 2 * pi * radius;
     }

    @Override
    public double flaeche() {
        return pi * (Math.pow(radius, radius));
    }

    @Override
    public void multiply(double d) {
        radius = radius * d;
    }

    @Override
    public void resize() {

    }

    @Override
    public Punkt2D position() {
        return mittelpunkt;
    }

    @Override
    public void moveTo(Punkt2D a) {
        this.mittelpunkt = a;
    }
}
