package Prog1.AB7.Aufgabe3;

import java.util.Arrays;

public class Histogramm {
    public static void histogrammA(int[] a) {
        String stern = "*";
        int wert;
        int[] help = new int[10];
        for(int i = 0; i < a.length;i++) {
            wert = a[i];
            help[wert]++;
        }
        for(int j = 0; j < help.length; j++) {
            System.out.print(j + ": ");
            for(int k = 0; k < help[j]; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(help));
    }

    public static void main(String[] args) {
        int[] a = {6,8,1,8,5,2,2,3,7,1,5,3,1,0,1,5,6,6,9};
        histogrammA(a);
    }
}
