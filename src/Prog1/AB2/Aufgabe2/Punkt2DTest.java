package Prog1.AB2.Aufgabe2;

public class Punkt2DTest {
    public static void main(String[] args) {
        //Punkt als 0.0
        Punkt2D p = new Punkt2D();
        //mit Bestimmten Punkten
        Punkt2D p2 = new Punkt2D(3.0, 3.0);
        Punkt2D p3 = new Punkt2D(p2);

        System.out.println("Initialisierung Punkt2D");
        System.out.println(p);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println();

        // getter
        System.out.println("Getter Test:");
        System.out.println(p.getXCoord()); // 0.0
        System.out.println(p.getYCoord()); // 0.0
        System.out.println(p3.getXCoord()); // 3.0
        System.out.println(p3.getYCoord()); // 3.0

        System.out.println();

        //verschiebeUm p = 0.0,0.0 soll zu 1.0,1.0 werden
        p.verschiebeUm(4.0,4.0);
        System.out.println(p);

        System.out.println();

        //moveTo soll p2 = (3.0,3.0) zu (5.0,5.0) bringen
        System.out.println(p2.moveTo(5.0, 5.0));

        System.out.println();

        //toString
        System.out.println(p3.toString()); // Sollte (3.0,3.0) sein

        System.out.println();

        //distanceTo

        System.out.println("P: " + p.toString());
        System.out.println("P2: " + p2.toString());
        System.out.println("P3: " + p3.toString());
        System.out.println(p.distanceTo(p2));
    }
}
