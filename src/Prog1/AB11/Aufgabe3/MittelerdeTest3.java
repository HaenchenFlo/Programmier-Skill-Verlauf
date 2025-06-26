package Prog1.AB11.Aufgabe3;

import Prog1.AB9.Aufgabe4.Hobbit;
import Prog1.AB9.Aufgabe4.Magier;

public class MittelerdeTest3 {
    public static void main(String[] args) {
        Waffe schwert = new Waffe("Orkbrecher", 18.0, 150.0);
        Pferd shadowfax = new Pferd("Schattenfell", 500.0, 600);

        Hobbit sam = new Hobbit("Samweis", 200);
        Magier gandalf = new Magier("Gandalf", 1000);

        sam.kaufen(schwert);   // sollte funktionieren
        sam.kaufen(shadowfax); // zu schwer → nicht tragbar

        gandalf.kaufen(shadowfax); // klappt

        Hobbit frodo = new Hobbit("Frodo", 300);

        Waffe kleinschwert = new Waffe("Schwert", 15.0, 100.0);
        Waffe axt = new Waffe("Axt", 18.0, 120.0);

        frodo.kaufen(kleinschwert);  // sollte klappen
        frodo.kaufen(axt);      // sollte scheitern → trägt schon etwas
    }
}
