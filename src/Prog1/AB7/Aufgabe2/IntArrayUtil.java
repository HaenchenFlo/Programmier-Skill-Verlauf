package Prog1.AB7.Aufgabe2;

import java.util.Random;

public class IntArrayUtil {
    public static String toString(int [] a) {
        String s = "{";
        for (int i = 0; i < a.length; i++) {
            s = s + a[i];
            if(i < a.length - 1) {
                s+=",";
            }
        }
        return s + "}";
    }

    public static boolean areEqual(int[] a, int [] b) {
        if(a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static void shuffle(int[] a) {
        int n = a.length;
        Random rand = new Random();
        for(int i = 0; i < n - 1; i++) {
            int x = rand.nextInt(n - (i - 1)) + (i - 1);
            //tausch
            int temp = a[i];
            a[i] = a[x];
            a[x] = temp;
        }
    }

    public static int[] createSequence(int n) {
        if(n <= 0) return new int[0];
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = i;
        }
        return a;
    }

    public static boolean contains(int[] a, int n) {
        for(int i = 0; i < a.length; i++) {
            if(a[i] == n) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsMultiple(int[] a) {
        return false;
    }

    public static int pos(int[] a, int n) {
        return -1;
    }
}
