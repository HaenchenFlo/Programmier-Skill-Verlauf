package Prog1.AB6.Aufgabe2;

public class FibonacciIterativ {
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }

    public static int fibonacci(int n) {
        if(n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int a = 0;
        int b = 1;
        int erg = 0;

        for(int i = 2; i <= n; i++) {
            erg = a + b;
            a = b;
            b = erg;
        }
        return erg;
    }
}
