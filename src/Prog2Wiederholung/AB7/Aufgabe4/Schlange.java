package Prog2Wiederholung.AB7.Aufgabe4;

public interface Schlange<T> {
    int size();
    boolean isEmpty();
    T front();
    void enqueue(T e);
    void dequeue();
}
