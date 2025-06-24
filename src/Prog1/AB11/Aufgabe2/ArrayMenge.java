package Prog1.AB11.Aufgabe2;


public class ArrayMenge implements Menge {
    private int[] werte;
    private int anzahl;

    public ArrayMenge() {
        werte = new int[6];
        anzahl = 0;
    }



    @Override
    public boolean isEmpty() {
        return anzahl == 0;
    }

    @Override
    public int size() {
        return anzahl;
    }

    @Override
    public boolean contains(int n) {
        for(int i = 0; i < werte.length; i++) {
            if(werte[i] == n) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void insert(int n) {
        if(anzahl < 6 && n >= 1 && !contains(n)) {
            werte[anzahl] = n;
            anzahl++;
        }
    }

    @Override
    public void remove(int n) {
        for (int i = 0; i < anzahl; i++) {
            if (werte[i] == n) {
                werte[i] = werte[anzahl - 1]; // Letztes Element nach vorne holen
                anzahl--;
                return;
            }
        }
    }

    @Override
    public Menge copy() {
        ArrayMenge copy = new ArrayMenge();
        for(int i = 0; i < werte.length; i++) {
            copy.insert(werte[i]);
        }
        return copy;
    }

    @Override
    public int get() {
        if(!isEmpty()) {
            return werte[anzahl - 1];
        } else {
            throw new IllegalArgumentException("Werte Leer");
        }
    }

    public int[] toSortedArray() {
        int[] copy = new int[anzahl];
        for (int i = 0; i < anzahl; i++) {
            copy[i] = werte[i];
        }
        java.util.Arrays.sort(copy);
        return copy;
    }
}
