package Prog2.AB6.Aufgabe2;

import Prog2.AB6.Folge;

import java.util.Iterator;

public class FolgeDVL<T> implements Folge<T> {


    private DVL<T> list;

    public FolgeDVL() {
        this.list = new DVL<>();
    }


    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean contains(T e) {
        return list.contains(e);
    }

    @Override
    public T get(int pos) throws IndexOutOfBoundsException {
        return list.get(pos);
    }

    @Override
    public void set(int pos, T e) throws IndexOutOfBoundsException {
        list.set(pos, e);
    }

    @Override
    public void insert(int pos, T e) throws IndexOutOfBoundsException {
        list.insert(pos, e);
    }

    @Override
    public void remove(int pos) throws IndexOutOfBoundsException {
        list.remove(pos);
    }

    @Override
    public void delete(T e) {
        list.delete(e);
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
