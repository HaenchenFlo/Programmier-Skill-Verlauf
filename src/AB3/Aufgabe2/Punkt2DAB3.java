package AB3.Aufgabe2;

public class Punkt2DAB3 {
    double xCoord;
    double yCoord;
    public static double epsilon = 0.0001;

    //Konstruktor ohne Parameter --> Erzeugt 0.0
    public Punkt2DAB3() {
        this.yCoord = 0.0;
        this.xCoord = 0.0;
    }

    //Konstruktor werden zwei beliebige Koordinaten des Punktes übergeben
    public Punkt2DAB3(double x, double y) {
        this.xCoord = x;
        this.yCoord = y;
    }
    //get Epsilon
    public static double getEpsilon() {
        return epsilon;
    }
    //set Epsilon
    public static void setEpsilon(double newEpsilon) {
        epsilon = newEpsilon;
    }

    //Konstruktor Punkt-Objekt als Parameter erhält und eine Kopie vom Original erstellt
    public Punkt2DAB3(Punkt2DAB3 p) {
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

    public Punkt2DAB3 moveTo(double newX, double newY) {
        this.xCoord = newX;
        this.yCoord = newY;
        return this;
    }

    public String toString() {
        String x = "" + this.xCoord;
        String y = "" + this.yCoord;
        return "(" + x + ", "+  y + ")";
    }

    public double distanceTo(Punkt2DAB3 p) {
        double unterWurzX = (this.xCoord - p.xCoord) * (this.xCoord - p.xCoord);
        double unterWurzY = (this.yCoord - p.yCoord) * (this.yCoord - p.yCoord);
        return Math.sqrt(unterWurzX + unterWurzY);
    }

    //statische Methode von areEqual
    public static boolean areEqual(Punkt2DAB3 p1, Punkt2DAB3 p2) {
        return Math.abs((p1.xCoord - p2.xCoord)) <= epsilon &&
                Math.abs((p1.yCoord - p2.yCoord)) <= epsilon;
    }
    //Instanzmethode vergleicht this mit obj
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        Punkt2DAB3 other = (Punkt2DAB3) obj;
        return Math.abs((this.xCoord - other.xCoord)) <= epsilon &&
                Math.abs((this.yCoord - other.yCoord)) <= epsilon;

    }
}
