package Prog2Wiederholung.AB6.Aufgabe3;

import Prog2Wiederholung.AB6.Aufgabe1.FolgeAlsDynArray;
import Prog2Wiederholung.AB6.Folge;

public class FolgeTest {
    public static void main(String[] args) {
        Folge<Integer> folge = new FolgeAlsDynArray<>();
        folge.insert(0, 10);
        folge.insert(1, 42);
        folge.insert(2, 0);
        folge.insert(3, 8);
        folge.insert(4, 15);

        FolgeUtil.rotate(folge, 2);
        System.out.println(folge); // Erwartet: [8, 15, 10, 42, 0]

        FolgeUtil.swap(folge, 0, 4);
        System.out.println(folge); // Erwartet: [0, 15, 10, 42, 8]
    }
}
