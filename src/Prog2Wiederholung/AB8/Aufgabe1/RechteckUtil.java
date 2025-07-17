package Prog2Wiederholung.AB8.Aufgabe1;

import Prog2Wiederholung.AB6.Aufgabe1.FolgeAlsDynArray;
import Prog2Wiederholung.AB6.Folge;

import java.util.Comparator;

public class RechteckUtil {
    public static Rechteck min(Folge<Rechteck> f, Comparator<Rechteck> c) {
        if(f.isEmpty()) return null;

        Rechteck min = f.get(0);
        for(int i = 1; i < f.size(); i++) {
            Rechteck r = f.get(i);
            if(c.compare(r,min) < 0) {
                min = r;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        // Folge anlegen
        Folge<Rechteck> folge = new FolgeAlsDynArray<>();

        // Rechtecke hinzufügen
        folge.insert(0, new Rechteck(5, 10));  // Fläche 50
        folge.insert(1, new Rechteck(3, 4));   // Fläche 12
        folge.insert(2, new Rechteck(2, 8));   // Fläche 16

        // Flächen-Komparator
        Comparator<Rechteck> flaechenComparator = new Comparator<>() {
            @Override
            public int compare(Rechteck r1, Rechteck r2) {
                return Double.compare(r1.flaeche(), r2.flaeche());
            }
        };

        // Methode testen
        Rechteck minRechteck = RechteckUtil.min(folge, flaechenComparator);

        // Ergebnis ausgeben
        System.out.println("Rechteck mit kleinster Fläche:");
        System.out.println("Länge: " + minRechteck.getLaenge() + ", Breite: " + minRechteck.getBreite());
        System.out.println("Fläche: " + minRechteck.flaeche());
    }
}
