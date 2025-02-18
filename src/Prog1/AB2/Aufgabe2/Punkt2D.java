package Prog1.AB2.Aufgabe2;

public class Punkt2D {
    double xCoord;
    double yCoord;

    //Konstruktor ohne Parameter --> Erzeugt 0.0
    public Punkt2D () {
        this.yCoord = 0.0;
        this.xCoord = 0.0;
    }

    //Konstruktor werden zwei beliebige Koordinaten des Punktes übergeben
    public Punkt2D (double x, double y) {
        this.xCoord = x;
        this.yCoord = y;
    }

    //Konstruktor Punkt-Objekt als Parameter erhält und eine Kopie vom Original erstellt
    public Punkt2D (Punkt2D p) {
        this.xCoord = p.xCoord;
        this.yCoord = p.yCoord;
    }

    public double getXCoord() {
        return xCoord;
    }

    public double getYCoord() {
        return yCoord;
    }

    public void verschiebeUm(double dx, double dy) {
        this.xCoord += dx;
        this.yCoord += dy;
    }

    public Punkt2D moveTo(double newX, double newY) {
        this.xCoord = newX;
        this.yCoord = newY;
        return this;
    }

    public String toString() {
        String x = "" + this.xCoord;
        String y = "" + this.yCoord;
        return "(" + x + ", "+  y + ")";
    }

    public double distanceTo(Punkt2D p) {
        double unterWurzX = (this.xCoord - p.xCoord) * (this.xCoord - p.xCoord);
        double unterWurzY = (this.yCoord - p.yCoord) * (this.yCoord - p.yCoord);
        return Math.sqrt(unterWurzX + unterWurzY);
    }
}
