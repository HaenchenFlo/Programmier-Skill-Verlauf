package Prog1.ZL.Test1;

import Prog1.AB7.Aufgabe2.Punkt;

public class PunktTest {

    public static void main(String[] args) {
        Punkt a = new Punkt(0.8,15.0);
        Punkt b = new Punkt();

        a.verschiebeUm(-4,3);


        Punkt c = new Punkt(a.x / 2.0, a.y / 2.0);

        System.out.println("a: " + a);
        System.out.println("c: " + c);
    }
}
