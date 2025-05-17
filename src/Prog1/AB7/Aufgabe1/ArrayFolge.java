package Prog1.AB7.Aufgabe1;

public class ArrayFolge {
    public static int[] array(int n) {
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            int vorzeichen = (i % 2 == 0) ? 1 : -1;
            a[i] = vorzeichen  * (2 * i + 1);
        }
        return a;
    }

    public static void main(String[] args) {
        int [] res = array(4);
        for(int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
