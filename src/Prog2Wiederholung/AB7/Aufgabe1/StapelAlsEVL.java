package Prog2Wiederholung.AB7.Aufgabe1;

import java.util.NoSuchElementException;

public class StapelAlsEVL<T> implements Stapel<T> {

    private class ListenElement {
        T value;
        ListenElement next;

        ListenElement(T value, ListenElement next) {
            this.value = value;
            this.next = next;
        }
    }

    private ListenElement first;
    private int size;

    public StapelAlsEVL() {
        first = null;
        size = 0;
    }

    @Override
    public void push(T e) {
        first = new ListenElement(e, first);
        size++;
    }

    @Override
    public T pop() {
        if(isEmpty()) throw new NoSuchElementException("Stack Leer");
        T value = first.value;
        first = first.next;
        size--;
        return value;
    }

    @Override
    public T top() {
        if(isEmpty()) throw new NoSuchElementException("Stack Leer");
        return first.value;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
