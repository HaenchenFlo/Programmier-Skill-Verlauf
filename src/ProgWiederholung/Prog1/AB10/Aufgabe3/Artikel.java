package ProgWiederholung.Prog1.AB10.Aufgabe3;

public class Artikel {
    private String bezeichnung;
    private int artNr;
    private double einkaufsPreis;
    private double verkaufsPreis;
    private int lagerbestand;

    private static int neueNr = 0;
    private static int gesamtKapazität = 1000;
    private static int gesamtLagerBestand = 0;
    private static double gesamtAusgaben = 0.0;
    private static double gesamtEinnahmen = 0.0;

    public Artikel(String bezeichnung, double einkaufsPreis, double verkaufsPreis, int lagerbestand) throws LagerVollException {
        if(gesamtLagerBestand + lagerbestand > gesamtKapazität) {
            throw new LagerVollException("Kein Platz im Lager");
        }
        this.bezeichnung = bezeichnung;
        this.einkaufsPreis = einkaufsPreis;
        this.verkaufsPreis = verkaufsPreis;
        this.lagerbestand = lagerbestand;
        this.artNr = neueNr++;

        gesamtLagerBestand += lagerbestand;
    }


    //Getter
    public String getBezeichnung() {
        return this.bezeichnung;
    }

    public int getArtNr() {
        return this.artNr;
    }

    public double getEinkaufsPreis() {
        return this.einkaufsPreis;
    }

    public double getVerkaufsPreis() {
        return this.verkaufsPreis;
    }

    public int getLagerbestand() {
        return this.lagerbestand;
    }

    public void verkauf(int menge) throws KeinVorratsBestand {
        if(menge > lagerbestand) {
            throw new KeinVorratsBestand("Kein Vorrat mehr da");
        }

        gesamtEinnahmen += menge * verkaufsPreis;
        gesamtLagerBestand -= menge;
        lagerbestand -= menge;
    }

    public void einkauf(int menge) throws LagerVollException {
        if(menge + gesamtLagerBestand > gesamtKapazität) {
            throw new LagerVollException("Lager Voll");
        }

        lagerbestand += menge;
        gesamtLagerBestand += menge;
        gesamtAusgaben += menge * einkaufsPreis;
    }

}
