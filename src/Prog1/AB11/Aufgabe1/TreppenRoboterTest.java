package Prog1.AB11.Aufgabe1;

import Prog1.AB7.Aufgabe2.Punkt;

public class TreppenRoboterTest {

    public static void main(String[] args) {

        TreppenRoboter roboter = new TreppenRoboter();

        int n = 5; // Treppenhöhe
        System.out.println("Starte Treppe mit n = " + n);
        System.out.println("Startposition: " + roboter.position());

        // Starte die Treppe
        roboter.treppe(n);

        System.out.println("Endposition: " + roboter.position());
    }
}
