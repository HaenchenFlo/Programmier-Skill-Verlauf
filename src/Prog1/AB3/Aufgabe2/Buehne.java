package Prog1.AB3.Aufgabe2;

public class Buehne {
    private double ticketPreis;
    private int anzahlTickets;

    public Buehne(double ticketPreis) {
        this.ticketPreis = ticketPreis;
        this.anzahlTickets = 0;
    }

    public void ticketVerkauf(int anzahl) {
        if(anzahl > 0) {
            this.anzahlTickets += anzahl;
        }
    }

    public int getAnzahlTickets() {
        return anzahlTickets;
    }
}
