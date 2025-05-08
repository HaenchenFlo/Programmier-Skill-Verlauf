package Prog1.AB6.Aufgabe1;

public class Iteration {
    public static void main(String[] args) {
        System.out.println("Test mit n = 2: " + teilsumme(2));
        System.out.println("Test mit s = 2: " + grenzSumme(2));
        System.out.println("Test mit s = 2: " + grenzSummefor(2));
    }

    public static double teilsumme(int n) {
        if(n <= 0) {
            return -1;
        }
        double erg = 0;
        for(int i = 1; i <= n; i++) {
            erg = erg + 1.0 / i;
        }
        return erg;
    }

    public static int grenzSumme(int s) {
        if(s <= 0 || s == Integer.MAX_VALUE) {
            return -1;
        }
        double erg = 0;
        int n = 1;
        while(erg < s) {
            erg = erg + 1.0/n;
            n++;
        }
        return n - 1;
    }

    public static int grenzSummefor(int s) {
        if (s <= 0 || s == Integer.MAX_VALUE) return -1;
        double summe = 0;

        for(int n = 1;  ; n++) {
            summe += 1.0 / n;
            if(summe >= s) {
                return n;
            }
        }
    }
}
