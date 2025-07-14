package Prog1.AltKlausur.Klausuren.SS24;

public class A2 {
    public static boolean teilfolge(int[] a, int[] b) {
        int treffer = 0;
        int bI = 0;

        for(int i = 0; i < a.length && bI < b.length; i++) {
            if(a[i] == b[bI]) {
                bI++;
                treffer++;
            }
        }
        return treffer == b.length;
    }

    public static void main(String[] args) {
        int[] a = {-7,0,15,1,8,1,12};
        int[] b = {-7,0,15,8,12};
        int[] c = {-7,11,0,8,12};



        System.out.println(teilfolge(a,b));
        System.out.println(teilfolge(a,c));
    }
}
