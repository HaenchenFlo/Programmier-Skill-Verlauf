package AB1.Aufgabe3;

public class GehaltBerechnen {
    public static void main(String[] args) {
        int a, b;
        a = 5;
        b = 8;
        System.out.println(Gehalt.berechneGehalt(3, 4));
        System.out.println(Gehalt.berechneGehalt(a, b)); //gehalt Stufe 5, Zugehörigkeit 8 sollte 3230.0 sein
    }
}
