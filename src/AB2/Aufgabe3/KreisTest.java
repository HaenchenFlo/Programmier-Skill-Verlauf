package AB2.Aufgabe3;

import AB2.Aufgabe2.Punkt2D;

public class KreisTest {
    public static void main(String[] args) {
        Punkt2D p = new Punkt2D(1.0,1.0); // soll (1,1)
        Punkt2D p2 = new Punkt2D(2.0, 3.0);
        System.out.println("Kreis initialisierung");
        Kreis kreis = new Kreis(p,4.0); //Soll M(1,1) r = 4
        Kreis kreis2 = new Kreis(p2, 5.0);  //Soll M(2,3) r = 5
        Kreis kreis3 = new Kreis(); //Soll M(0,0) r = 1

        System.out.println(kreis.toString());
        System.out.println(kreis2.toString());
        System.out.println(kreis3.toString());


        System.out.println();

        //von
        System.out.println(kreis3.toString());
        System.out.println("verschiebe Kreis3(0.0,0.0 zu 2.0,2.0)");
        kreis3.verschiebeUm(2.0, 2.0);
        System.out.println(kreis3.toString());

        System.out.println();

        kreis.skalierung(2);
        System.out.println(kreis.toString()); //soll 2 * 4 = 8

        System.out.println();
        // Flächeninhalt
        System.out.println(kreis3.fInhalt()); //PI

        System.out.println();
        // Flächeninhalt
        System.out.println(kreis3.umfang()); // 2 * PI

        System.out.println();


        Punkt2D p3 = new Punkt2D(3.0, 3.0);
        Punkt2D p4 = new Punkt2D(8.0, 3.0);
        System.out.println("Ist Punkt 3: " + p3.toString() + "im Kreis2 : " + kreis2.toString());
        System.out.println(kreis2.imKreis(p3));
        System.out.println("Ist Punkt 4: " + p4.toString() + "im Kreis2 : " + kreis2.toString());
        System.out.println(kreis2.imKreis(p4));
    }
}
