package Prog1.AB5.Aufgabe2;

public class MathUtil {
    public static int min2(int a, int b) {
        if(a < b) {
            return a;
        }
        return b;
    }
    public static int min3(int a, int b, int c) {
        return min2(min2(a,b),c);
    }
    public static int min4(int a, int b, int c, int d) {
        return min2(min2(a,b), min2(c,d));
    }
    public static void main(String[] args) {
        System.out.println("Kleinster Wert von 2: " + min2(5, 3));  // Ausgabe: 3
        System.out.println("Kleinster Wert von 3: " + min3(5, 3, 7));  // Ausgabe: 3
        System.out.println("Kleinster Wert von 4: " + min4(5, 3, 7, 2));  // Ausgabe: 2
    }
}
