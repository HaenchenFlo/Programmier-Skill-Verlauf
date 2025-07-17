package Prog2Wiederholung.AB1.Aufgabe2;

public class Strecke extends GeoObjekt implements Messbar {
    private Punkt2D a;
    private Punkt2D b;

    public Strecke(Punkt2D a, Punkt2D b) {
        this.a = a;
        this.b = b;
    }

    public Punkt2D anfP() {
        return this.a;
    }

    public Punkt2D endP() {
        return this.b;
    }



    @Override
    public double laenge() {
        return a.abstand(b);
    }

    @Override
    public Punkt2D position() {
        double midX = (a.x() + b.x()) / 2;
        double midY = (a.y() + b.y()) / 2;
        return new Punkt2D(midX, midY);
    }

    @Override
    public void moveTo(Punkt2D newStartPunkt) {
        double deltaX = newStartPunkt.x() - a.x();  // Berechne den Unterschied in der x-Koordinate
        double deltaY = newStartPunkt.y() - a.y();  // Berechne den Unterschied in der y-Koordinate

        // Verschiebe sowohl a als auch b
        a = new Punkt2D(a.x() + deltaX, a.y() + deltaY);
        b = new Punkt2D(b.x() + deltaX, b.y() + deltaY);
    }

}
