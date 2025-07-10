package Prog2.AB8.Aufgabe5;

import Prog2.AB6.Folge;

import java.util.Comparator;

public class SortierUtil {
    public static <T> void bubbleSort(Folge<T> folge, Comparator<T> cmp) {
        int n = folge.size();
        for(int i = n; i > 1; i--) {
            for(int j = 0; j < i - 1; j++) {
                T a = folge.get(j);
                T b = folge.get(j + 1);
                if(cmp.compare(a,b) > 0) {
                    folge.set(j, b);
                    folge.set(j + 1, a);
                }
            }
        }
    }
}
