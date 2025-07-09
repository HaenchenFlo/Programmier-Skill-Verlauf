package Prog1.AltKlausur.Klausuren.SS23;

public class Aufgabe3 {
    public static int rank(int[] array, int pos) {
        if(pos < 0 || pos >= array.length) {
            return -1;
        }
        int rank = 0;
        int elem = array[pos];
        for(int i = 0; i < array.length; i++) {
            if(array[i] <= elem) {
                rank++;
            }
        }
        return rank;
    }

    public static void main(String[] args) {
        int[] a = {6,-2,4,0,7,6,1,-3};
        System.out.println(rank(a,2));
    }
}
