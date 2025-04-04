package ProgWiederholung.Prog1.AB6.Aufgabe2;

public class Kredit {
    //Instanzvariablen
    private double kSumme; //Kredit höhe
    private double rate;
    private double restSchuld;

    private static double p = 2.5; //Zinssatz

    //Konstruktor
    public Kredit(double kSumme, double rate) {
        this.kSumme = kSumme;
        if(rate < kSumme * p / 100) {
            rate = kSumme * p / 100;
            System.out.println("Rate war zu niedrig und wurde auf " + rate + " angepasst.");
        }
        this.rate = rate;
        this.restSchuld = kSumme;
    }

    //getter setter
    public static void setP(double pNeu) {
        p = pNeu;
    }

    //Instanzmethoden
    public void tilgungsPlan() {
        System.out.print("        Zins        ");
        System.out.println("Restschuld");
        double zins;
        int Jahr = 1;
        while (restSchuld > rate) {
            zins = restSchuld * p/100;

            if(restSchuld + zins <= rate) {
                rate = restSchuld + zins;
            }

            restSchuld = restSchuld + zins - rate;

            System.out.println(Jahr + ". Jahr:" + zins + "        " + restSchuld);
            Jahr++;
        }
    }
}
