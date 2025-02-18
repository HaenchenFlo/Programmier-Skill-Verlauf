package Prog1.AB1.Aufgabe3;

public class Gehalt {
    public static double berechneGehalt(double gehaltsStufe, double firmenZugehoerigkeit) {
        return 1250 + gehaltsStufe * 300 + firmenZugehoerigkeit * 60;
    }
}
