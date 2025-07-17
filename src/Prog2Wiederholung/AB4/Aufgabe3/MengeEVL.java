package Prog2Wiederholung.AB4.Aufgabe3;

import Prog2Wiederholung.AB3.Aufgabe3.Menge;
import Prog2Wiederholung.AB4.Aufgabe2.EVL;

public class MengeEVL<T> implements Menge<T> {
    private EVL<T> evl;

    public MengeEVL() {
        this.evl = new EVL<>();
    }

    @Override
    public int size() {
        return evl.size();
    }

    @Override
    public boolean isEmpty() {
        return evl.isEmpty();
    }

    @Override
    public T get() {
        return evl.getFirst();
    }

    @Override
    public void insert(T e) {
        if(!evl.contains(e)) {
            evl.insert(e);
        }
    }

    @Override
    public void delete(T e) {
        evl.delete(e);
    }

    @Override
    public boolean contains(T e) {
        return evl.contains(e);
    }
}
