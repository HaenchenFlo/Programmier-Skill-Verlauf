package Prog2.AB8.Aufgabe1;

import java.util.Comparator;

public class RechteckVergleicher {
    public static Comparator<Rechteck> nachUmfang = new Comparator<Rechteck>() {
        @Override
        public int compare(Rechteck o1, Rechteck o2) {
            return Double.compare(o1.umfang(),o2.umfang());
        }
    };


    public static Comparator<Rechteck> nachFlaeche = new Comparator<Rechteck>() {
        @Override
        public int compare(Rechteck o1, Rechteck o2) {
            return Double.compare(o1.flaeche(),o2.flaeche());
        }
    };
}
