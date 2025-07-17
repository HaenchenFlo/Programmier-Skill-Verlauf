package Prog2Wiederholung.AB7.Aufgabe4;

import java.util.NoSuchElementException;

public class SchlangeAlsRingPuffer<T> implements Schlange<T> {

    private T[] puffer;
    private int size;
    private int head;
    private int tail;
    private final int capacity;

    public SchlangeAlsRingPuffer(int capacity) {
        this.capacity = capacity;
        this.puffer = (T[]) new Object[capacity];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T front() {
        if(this.size == 0) {
            throw new NoSuchElementException("Kein Element Vorhanden");
        }
        return puffer[head];
    }

    @Override
    public void enqueue(T e) {
        if(this.size == capacity) {
            throw new RuntimeException("Puffer Voll");
        }
        puffer[tail] = e;
        tail = (tail + 1) % capacity;
        size++;
    }

    @Override
    public void dequeue() {
        if(this.size == 0) {
            throw new NoSuchElementException("Kein Element Vorhanden");
        }
        puffer[head] = null;
        head = (head + 1) % capacity;
        size--;
    }
}
