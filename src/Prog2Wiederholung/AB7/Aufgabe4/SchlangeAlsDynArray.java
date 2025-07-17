package Prog2Wiederholung.AB7.Aufgabe4;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class SchlangeAlsDynArray<T> implements Schlange<T> {

    private ArrayList<T> daten = new ArrayList<>();

    @Override
    public int size() {
        return daten.size();
    }

    @Override
    public boolean isEmpty() {
        return daten.isEmpty();
    }

    @Override
    public T front() {
        if(daten.isEmpty()) {
            throw new NoSuchElementException("Kein Element in der Liste");
        }
        return daten.get(0);
    }

    @Override
    public void enqueue(T e) {
        daten.add(e);
    }

    @Override
    public void dequeue() {
        if(daten.isEmpty()) {
            throw new NoSuchElementException("Kein Element in der Liste");
        }
        daten.remove(0);
    }
}
