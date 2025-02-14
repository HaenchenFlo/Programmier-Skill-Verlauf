package AufgabenHelena.AB1.Aufgabe4;

public class Funktion {
    public static int f(int x) {
        return 3 * x + 7;
    }

    public static int g(int x, int y) {
        return 5 * x - 2 * y;
    }

    public static int fg(int x, int y) {
        return f(g(x, y));
    }
}
