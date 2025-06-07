package Prog2.AB6;

public interface Folge<T> extends Iterable<T> {
    int size();
    boolean isEmpty();
    boolean contains(T e);
    T get(int pos) throws IndexOutOfBoundsException;
    void set(int pos, T e) throws IndexOutOfBoundsException;
    void insert(int pos, T e) throws IndexOutOfBoundsException;
    void remove(int pos) throws IndexOutOfBoundsException;
    void delete(T e);
}
