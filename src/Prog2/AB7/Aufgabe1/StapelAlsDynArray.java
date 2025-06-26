package Prog2.AB7.Aufgabe1;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class StapelAlsDynArray<T> implements Stapel<T> {

    private ArrayList<T> daten = new ArrayList<>();


    @Override
    public void push(T e) {
        daten.add(e);
    }

    @Override
    public T pop() {
        if(daten.isEmpty()) {
            throw new NoSuchElementException("Kein Element Vorhanden");
        }
        return daten.remove(daten.size() - 1);
    }

    @Override
    public T top() {
        if(daten.isEmpty()) {
            throw new NoSuchElementException("Kein Element Vorhanden");
        }
        return daten.get(daten.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return daten.isEmpty();
    }
}
