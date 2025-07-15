package Prog1.AltKlausur.Klausuren.SS22;

public class A1 {
    public static int fibonacci(int n) {
        int fnminus2 = 1;
        int fnminus1 = 1;
        int fn = 1;

        int i = 3;
        do {
            if(i > n) break;
            fn = fnminus1 + fnminus2;
            fnminus2 = fnminus1;
            fnminus1 = fn;
            i++;
        }
        while (i <= n);
        return fn;
    }
}
