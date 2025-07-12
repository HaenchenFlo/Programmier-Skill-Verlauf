package Prog2.AB9.Aufgabe3;

import Prog2.AB3.Aufgabe3.Menge;

public class MengeUtil {
    public static <T extends Comparable<T>> T min(Menge<T> menge) {
        if(menge == null || menge.isEmpty()) {
            throw new IllegalArgumentException("Die Menge ist leer");
        }

        T min = menge.get();
        menge.delete(min);

        while(!menge.isEmpty()) {
            T current = menge.get();
            menge.delete(current);

            if(current.compareTo(min) < 0) {
                min = current;
            }
        }
        return min;
    }
}

//T min = menge.get(); wenn menge iterable ist
//        for(T cur : menge) {
//        if(cur.compareTo(min) < 0) {
//min = cur;
//            }
//                    }
