package Prog2.AB9.Aufgabe3_5;

import Prog2.AB3.Aufgabe3.Menge;

import java.util.Arrays;

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

    public static <T extends Comparable<T>> T[] mergeSort(T[] array) {
        if (array.length <= 1) return array;

        int half = array.length / 2;
        T[] left = Arrays.copyOf(array, half);
        T[] right = Arrays.copyOfRange(array, half, array.length);

        left = mergeSort(left);
        right = mergeSort(right);

        T[] sorted = Arrays.copyOf(array, array.length);
        int i = 0, jLeft = 0, jRight = 0;

        while (jLeft < left.length && jRight < right.length) {
            if (left[jLeft].compareTo(right[jRight]) <= 0) {
                sorted[i++] = left[jLeft++];
            } else {
                sorted[i++] = right[jRight++];
            }
        }

        while (jLeft < left.length) sorted[i++] = left[jLeft++];
        while (jRight < right.length) sorted[i++] = right[jRight++];

        return sorted;
    }



    public static <T extends Comparable<T>> void quicksort(T[] array, int l, int r) {
        //Anker
        if(r - l < 1) return;

        int iLeft = l;
        int iRight = r - 1;
        int iPivot = r;

        do {
            while(array[iLeft].compareTo(array[iPivot]) < 0 && iLeft < iRight) iLeft++;
            while(array[iRight].compareTo(array[iPivot]) >= 0 && iLeft < iRight) iRight--;
            if(iLeft < iRight) swap(array,iLeft,iRight);
        } while (iLeft < iRight);
        if(array[iPivot].compareTo(array[iLeft]) < 0) {
            swap(array, iRight, iPivot);
            iPivot = iRight;
        }
        System.out.println("Split: " + Arrays.toString(Arrays.copyOfRange(array, l, iPivot)) + " " + array[iPivot] + " " + Arrays.toString(Arrays.copyOfRange(array, iPivot + 1, r + 1)));

        quicksort(array, l, iPivot - 1);
        quicksort(array, iPivot + 1, r);
        System.out.println("After: " + Arrays.toString(Arrays.copyOfRange(array, l, iPivot)) + " " + array[iPivot] + " " + Arrays.toString(Arrays.copyOfRange(array, iPivot + 1, r + 1)));
    }


    public static <T> void swap(T[] elements, int i, int j) {
        T tmp = elements[i];
        elements[i] = elements[j];
        elements[j] = tmp;
    }
}

//T min = menge.get(); wenn menge iterable ist
//        for(T cur : menge) {
//        if(cur.compareTo(min) < 0) {
//min = cur;
//            }
//                    }
