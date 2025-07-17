package Prog2Wiederholung.AB7.Aufgabe4;


import Prog2Wiederholung.AB6.Aufgabe2.DVL;

public class SchlangeAlsEVL<T> implements Schlange<T> {

    private final DVL<T> list;

    public SchlangeAlsEVL() {
        list = new DVL<>();
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
    public T front() {
        return list.getFirst();
    }

    @Override
    public void enqueue(T e) {
        list.append(e);
    }

    @Override
    public void dequeue() {
        list.removeFirst();
    }

    @Override
    public String toString() {
        return "SchlangeAlsEVL{" + "list=" + list + '}';
    }
}
