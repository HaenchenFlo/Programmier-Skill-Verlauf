package Prog1.AltKlausur.Klausuren.SS21;

public class A1 {
    public static int reihe(int s) {
        int erg = 0;
        double r = 0;
        while(r < s) {
            erg++;
            r = r + 1.0/erg;
        }
        return erg;
    }

    public static void main(String[] args) {
        System.out.println(reihe(2));
    }
}
