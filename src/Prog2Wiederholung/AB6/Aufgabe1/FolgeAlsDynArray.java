package Prog2Wiederholung.AB6.Aufgabe1;

import Prog2Wiederholung.AB5.Aufgabe3.DynArrayWI;
import Prog2Wiederholung.AB6.Folge;

import java.util.Iterator;



public class FolgeAlsDynArray<T> implements Folge<T> {

    /* Instanzvariablen */

    private DynArrayWI<T> dynarr;

    /* Konstruktoren */

    public FolgeAlsDynArray() {
        dynarr = new DynArrayWI<>();
    }

    /* Instanzmethoden */

    @Override
    public int size() {
        return dynarr.size();
    }

    @Override
    public boolean isEmpty() {
        return dynarr.isEmpty();
    }

    @Override
    public boolean contains(T e) {
        return dynarr.contains(e);
    }

    @Override
    public T get(int pos) {
        return dynarr.get(pos);
    }

    @Override
    public void set(int pos, T e) {
        dynarr.set(pos, e);
    }

    @Override
    public void insert(int pos, T e) {
        dynarr.add(e);
        if (pos == dynarr.size()) return;
        for (int i = dynarr.size() - 2; i >= pos; i--)
            dynarr.set(i+1, dynarr.get(i));
        dynarr.set(pos, e);
    }

    @Override
    public void remove(int pos) {
        if (pos < 0 || pos >= dynarr.size()) throw new ArrayIndexOutOfBoundsException();
        dynarr.remove(pos);
    }

    @Override
    public void delete(T e) {
        dynarr.delete(e);
    }

    @Override
    public Iterator<T> iterator() {
        return dynarr.iterator();
    }

    @Override
    public String toString() {
        return "FolgeAlsDynArray{" +
                "dynarr=" + dynarr +
                '}';
    }
}
