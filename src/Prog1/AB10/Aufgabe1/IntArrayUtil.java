package Prog1.AB10.Aufgabe1;

import java.util.NoSuchElementException;

public class IntArrayUtil {

    public static int pos(int[] a, int b) throws NoSuchElementException {
        for(int i = 0; i < a.length; i++) {
            if(a[i] == b) {
                return i;
            }
        }
        throw new NoSuchElementException("Nicht vorhanden");
    }


    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 5, 9};

        // Fall 1: Wert kommt genau einmal vor
        try {
            int pos1 = IntArrayUtil.pos(arr, 3); // sollte 0 sein
            System.out.println("Position von 3: " + pos1);
        } catch (NoSuchElementException e) {
            System.out.println("Fehler: " + e.getMessage());
        }

        // Fall 2: Wert kommt mehrmals vor
        try {
            int pos2 = IntArrayUtil.pos(arr, 5); // sollte 1 sein
            System.out.println("Position von 5: " + pos2);
        } catch (NoSuchElementException e) {
            System.out.println("Fehler: " + e.getMessage());
        }

        // Fall 3: Wert kommt gar nicht vor
        try {
            int pos3 = IntArrayUtil.pos(arr, 8); // sollte Exception werfen
            System.out.println("Position von 8: " + pos3);
        } catch (NoSuchElementException e) {
            System.out.println("Fehler: " + e.getMessage());
        }
    }
}
