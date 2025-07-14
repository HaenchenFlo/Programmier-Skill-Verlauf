package Prog1.AltKlausur.Klausuren.SS24;

public class A3 {
    public static int[][] sose25(int n) {
        int[][] res = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                res[i][j] = i;
            }
            for(int j = i + 1; j < n; j++) {
                res[i][j] = j;
            }
        }
        return res;
    }
}
