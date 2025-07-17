package Prog2Wiederholung.AB1.Aufgabe2;

public class Quadrat extends GeoObjekt2D {
    private Punkt2D LU;
    private double kante;

    public Quadrat(Punkt2D LU, double kante) {
        this.LU = LU;
        this.kante = Math.abs(kante);
    }

    public Punkt2D eckeLU() {
        return this.LU;
    }

    public Punkt2D eckeRO() {
        double x = LU.x() + kante;
        double y = LU.y() + kante;
        return new Punkt2D(x,y);
    }

    public double kanten() {
        return this.kante;
    }



    @Override
    public double umfang() {
        return 4 * kante;
    }

    @Override
    public double flaeche() {
        return kante * kante;
    }

    @Override
    public void multiply(double d) {
        this.kante = Math.abs(this.kante * d);
    }

    @Override
    public void resize() {

    }

    @Override
    public Punkt2D position() {
        return this.LU;
    }

    @Override
    public void moveTo(Punkt2D a) {
        this.LU = a;
    }
}
