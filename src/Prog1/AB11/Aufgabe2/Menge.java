package Prog1.AB11.Aufgabe2;

public interface Menge {
    boolean isEmpty();
    int size();
    boolean contains(int n);
    void insert(int n);
    void remove(int n);
    Menge copy();
    int get();
}
