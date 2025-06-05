package Prog2.AB4.Aufgabe4;

import jdk.jshell.spi.SPIResolutionException;

import java.util.NoSuchElementException;

public class DVL<T> {
    private ListenElement first;
    private ListenElement last;
    private int size;

    protected class ListenElement {
        private ListenElement prev;
        private ListenElement next;
        T value;

        ListenElement(T v) {
            value = v;
            prev = null;
            next = null;
        }
    }

    public DVL() {
        this.first = null;
        this.size = 0;
    }

    public int size() {return this.size;}

    public boolean isEmpty() {return first == null;}

    public boolean contains(T v) {
        ListenElement e = first;
        while(e != null) {
            if(e.value.equals(v)) {
                return true;
            }
            e = e.next;
        }
        return false;
    }

    public T get(int pos) {
        if(pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("Ungültige Pos: " + pos);
        }
        ListenElement e = first;
        for(int i = 0; i < pos; i++) {
            e = e.next;
        }

        return e.value;
    }

    public T getFirst() {
        if(isEmpty()) {
            throw new NoSuchElementException("Liste Leer");
        }
        return first.value;
    }

    public T getLast() {
        if(isEmpty()) {
            throw new NoSuchElementException("Liste Leer");
        }
        return last.value;
    }

    public void set(int pos, T v) {
        if(pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("Ungültige Pos: " + pos);
        }
        ListenElement e = first;
        for(int i = 0; i < pos; i++) {
            e = e.next;
        }
        e.value = v;
    }


    public void insert(T v) {
        ListenElement neu = new ListenElement(v);
        neu.next = first;
        if (first != null) {
            first.prev = neu;
        }
        first = neu;
        size++;
    }

    public void append(T v) {
        ListenElement neu = new ListenElement(v);
        if (isEmpty()) {
            first = neu;
            last = neu;
        } else {
            last.next = neu;
            neu.prev = last;
            last = neu;
        }
        size++;
    }

    public void insert(int pos, T v) {
        if(pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("Ungültige Pos: " + pos);
        }
        ListenElement neu = new ListenElement(v);

        if(pos == 0) {
            insert(v);
        } else {
            ListenElement e = first;
            for(int i = 0; i < pos; i++) {
                e = e.next;
            }
            neu.next = e.next;
            neu.prev = e;

            if(e.next != null) {
                e.next.prev = neu;
            }
            e.next = e;
        }

        size++;
    }

    public void remove(int pos) {
        ListenElement e = first;
        if(pos == 0) {
            removeFirst();
            return;
        }
        for(int i = 0; i < pos; i++) {
            e = e.next;
        }

        if(e.prev != null) {
            e.prev.next = e.next;
        }
        if(e.next != null) {
            e.next.prev = e.prev;
        }

        if(e.next == null) {
            last = e.prev;
        }
        size--;
    }

    public void removeFirst() {
        if (isEmpty())
            return;

        first = first.next;
        size--;
    }

    public void removeLast() {
        if (isEmpty())
            return;

        last = last.prev;
        size--;
    }

    public void delete(T v) {
        if (isEmpty()) return;

        ListenElement e = first;
        while (e != null && !e.value.equals(v)) {
            e = e.next;
        }

        // Element mit Wert v nicht gefunden
        if (e == null) return;

        // Element ist erstes
        if (e == first) {
            removeFirst();
            return;
        }

        // Element ist letztes
        if (e == last) {
            removeLast();
            return;
        }

        // Element ist irgendwo in der Mitte
        e.prev.next = e.next;
        e.next.prev = e.prev;
        size--;
    }

}
