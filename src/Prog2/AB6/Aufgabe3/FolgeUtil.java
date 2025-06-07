package Prog2.AB6.Aufgabe3;

import Prog2.AB6.Folge;

public class FolgeUtil {
    public static <T> int frequency(Folge<T> f, T v) {
        int count = 0;
        for(T element : f) {
            if(element.equals(v)) {
                count++;
            }
        }
        return count;
    }

    public static <T> void swap(Folge<T> f, int i, int j) {
        T temp = f.get(i);
        f.set(i, f.get(j));
        f.set(j, temp);
    }
    @SuppressWarnings("unchecked")
    public static <T> void rotate(Folge<T> f,int d) {
        int size = f.size();
        if(size == 0) return;

        d = ((d % size) + size) % size;
        if(d == 0) return;

        Object[] temp = new Object[size];

        for(int i = 0; i < size; i++) {
            temp[(i + d) % size] = f.get(i);
        }

        for(int i = 0; i < size; i++) {
            f.set(i,(T) temp[i]);
        }
    }
}

















