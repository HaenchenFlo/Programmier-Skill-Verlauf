package ProgWiederholung.Prog1.AB7.Aufgabe2;

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
        for(int i = 0; i < a.length - 1; i++) {
            for(int j = i + 1; j < a.length + 1; j++) {
                if(a[i] == a[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int pos(int[] a, int n) {
        for(int i = 0; i < a.length; i++) {
            if(a[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public static int[] putRandom(int[] a, int von, int bis) {
        if(von >= bis) {
            System.out.println("von muss kleiner als bis sein");
            return a;
        }
        Random rand = new Random();
        for(int i = 0; i < a.length; i++) {
            int x = rand.nextInt(bis - von) + von;
            a[i] = x;
        }
        return a;
    }

    public static int[] createRandom(int a) {
        Random rand = new Random();
        if(a <= 0) {
            return new int[0];
        }
        int x = rand.nextInt(a) + 1;
        int[] b = new int[x];
        putRandom(b, 0, 100);

        return b;
    }

    public static int max(int[] a) {
        int max = a[0];
        for(int i = 0; i < a.length; i++) {
            if(a[i] >= max) {
                max = a[i];
            }
        }
        return max;
    }

    public static int min(int[] a) {
        int min = a[0];
        for(int i = 0; i < a.length; i++) {
            if(a[i] <= min) {
                min = a[i];
            }
        }
        return min;
    }

    public static int sum(int[] a) {
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static boolean isSorted(int[] a) {
        for(int i = 0; i < a.length - 1; i++) {
            if(a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void swap(int[] a, int b , int c) {
        if(b < 0 || c < 0 || b >= a.length || c >= a.length) {
            return;
        }
        int temp = a[b];
        a[b] = a[c];
        a[c] = temp;
    }

    public static int[] merge(int[] a, int[] b) {
        int[] merged = new int[a.length + b.length]; // Richtige Länge
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                merged[k++] = a[i++];
            } else {
                merged[k++] = b[j++];
            }
        }

        while (i < a.length) {
            merged[k++] = a[i++];
        }

        while (j < b.length) {
            merged[k++] = b[j++];
        }

        return merged;
    }
}
