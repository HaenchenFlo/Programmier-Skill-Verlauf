package ProgWiederholung.Prog1.AB4.Aufgabe2;

public class Spieler {
    public String name;
    public int spieleGewonnen;
    public int spieleZahl;
    public int spieleVerloren;

    public Spieler(String name) {
        this.name = name;
        this.spieleGewonnen = 0;
        this.spieleZahl = 0;
        this.spieleVerloren = 0;
    }
    public void spiel(boolean gewonnen) {
        spieleZahl++;
        if(gewonnen) {
            spieleGewonnen++;
        }
        else {
            spieleVerloren++;
        }
    }

    public double getSpielQuote() {
        if(spieleZahl == 0.0) return 0.0;
        return ((double) spieleGewonnen / spieleZahl) * 100;
    }

    public void zeigeBilanz() {
        System.out.println("Spielerbilanz fuer " + name +":");
        System.out.println("gewonnen: " + this.spieleGewonnen);
        System.out.println("verloren " + this.spieleVerloren);
        System.out.println("Quote: " + String.format("%.0f", getSpielQuote()) + "%");
    }
}
