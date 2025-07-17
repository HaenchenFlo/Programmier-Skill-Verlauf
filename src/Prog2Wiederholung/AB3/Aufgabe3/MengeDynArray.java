package Prog2Wiederholung.AB3.Aufgabe3;

import java.util.NoSuchElementException;

public class MengeDynArray<T> implements Menge<T> {
    private T[] array;
    private int size;
    private static final int START_CAPACITY = 4;

    @SuppressWarnings("unchecked")
    public MengeDynArray() {
        array = (T[]) new Object[START_CAPACITY];
        size = 0;
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
    public T get() throws NoSuchElementException {
        if (size == 0)
            throw new NoSuchElementException("Menge ist leer");
        return array[0];
    }

    @Override
    public void insert(T e) {
        if (contains(e)) return; // Keine Duplikate erlaubt

        if (size >= array.length) {
            grow();
        }

        array[size++] = e;
    }

    @Override
    public void delete(T e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(array[i])) {
                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[--size] = null;
                shrink();
                return;
            }
        }
    }

    @Override
    public boolean contains(T e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(array[i])) return true;
        }
        return false;
    }

    private void grow() {
        int newCapacity = array.length * 2;
        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    private void shrink() {
        if (array.length <= START_CAPACITY) return;
        if (size <= array.length / 4) {
            int newCapacity = Math.max(array.length / 2, START_CAPACITY);
            @SuppressWarnings("unchecked")
            T[] newArray = (T[]) new Object[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("{");
        for (int i = 0; i < size; i++) {
            s.append(array[i]);
            if (i < size - 1) s.append(", ");
        }
        return s.append("}").toString();
    }

}
