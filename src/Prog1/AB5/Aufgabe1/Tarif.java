package Prog1.AB5.Aufgabe1;

public class Tarif {
    //Statische Variablen
    private static double grundGebuer = 25.0;

    public static void setGrundGebuer(int grundGebuer) {
        Tarif.grundGebuer = grundGebuer;
    }

    //Instanzvariablen
    private int gespraechsMinuten;
    private int freiminuten;
    private double betragProMinute;

    //Konstruktoren
    public Tarif(int freiminuten, double betragProMinute) {
        this.freiminuten = freiminuten;
        this.betragProMinute = betragProMinute;
        gespraechsMinuten = 0;
    }
    //Instanzmethoden
    public void telefonieren(int anzahlminuten) {
        this.gespraechsMinuten += anzahlminuten;
    }

    public double rechnung() {
        double endRechnung;
        if(this.gespraechsMinuten > this.freiminuten) {
            endRechnung = Tarif.grundGebuer + (gespraechsMinuten - this.freiminuten) * this.betragProMinute;
        } else {
            endRechnung = Tarif.grundGebuer;
        }
        this.gespraechsMinuten = 0;
        return endRechnung;
    }
}
