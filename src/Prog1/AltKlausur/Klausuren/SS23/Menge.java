package Prog1.AltKlausur.Klausuren.SS23;

import java.util.NoSuchElementException;

public interface Menge {
    int size();
    boolean contains(int n);
    void insert(int n);
    void remove(int n);
    int get() throws NoSuchElementException;
}
