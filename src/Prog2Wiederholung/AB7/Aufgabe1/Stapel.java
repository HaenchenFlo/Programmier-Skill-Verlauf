package Prog2Wiederholung.AB7.Aufgabe1;

public interface Stapel<T> {
    void push(T e);
    T pop();
    T top();
    boolean isEmpty();
}
