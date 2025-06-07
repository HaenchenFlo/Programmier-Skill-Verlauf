package Prog2.AB5.Aufgabe1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class PostbotenIterator<T> implements Iterator<T> {

    private T[] array;
    private boolean rueckweg;
    private int pos;

    public PostbotenIterator(T[] array) {
        this.array = array;
        this.pos = 1;
        this.rueckweg = false;
    }

    @Override
    public boolean hasNext() {
        if(!rueckweg) {
            for(int i = pos; i < array.length; i += 2) {
                if(array[i] != null) {return true;}
            }
            rueckweg = true;
            pos = (array.length % 2 == 0) ? array.length - 2 : array.length - 1;
        }

        for(int i = pos; i >= 0; i -= 2) {
            if(array[i] != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public T next() {
        if(!hasNext()) throw new NoSuchElementException("Kein Haus Vorhanden");

        if(!rueckweg) {
            while(pos < array.length) {
                T current = array[pos];
                pos += 2;
                if(current != null) return current;
            }
            rueckweg = true;
            pos = (array.length % 2 == 0) ? array.length - 2 : array.length - 1;
        }

        while(pos >= 0) {
            T current = array[pos];
            pos -= 2;
            if(current != null) return current;
        }

        throw new NoSuchElementException("Kein Haus Vorhanden");
    }
}
