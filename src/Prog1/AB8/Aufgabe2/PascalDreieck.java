package Prog1.AB8.Aufgabe2;

public class PascalDreieck {
    public static int[][] pascalDreieck(int n) {
        int[][] res = new int[n][];
        for(int i = 0; i < n; i++) {
            res[i] = new int[n + 1];
            res[i][0] = 1;
            res[i][i] = 1;
            for(int j = 1; j < i; j++) {
                res[i][j] = res[i - 1][j - 1] + res[i - 1][j];
            }
        }
        return res;
    }

    public static void printMatrix(int[][] dreieck) {
        for(int[] row : dreieck) {
            for(int num : row) {
                if(num == 0) {
                    System.out.print("");
                } else {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[][] dreieck = pascalDreieck(5);
        int[][] dreieck2 = pascalDreieck(10);
        printMatrix(dreieck);
        printMatrix(dreieck2);
    }
}
