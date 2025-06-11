package Prog1.ZL.Test2;

public class ZL {


    public static int[] concat(int[] a, int[] b) {
        int[] erg = new int[a.length + b.length];
        for(int i = 0; i < a.length; i++) {
            erg[i] = a[i];
        }
        for(int j = 0; j < b.length; j++) {
            erg[j + a.length] = b[j];
        }

        return erg;
    }
}
