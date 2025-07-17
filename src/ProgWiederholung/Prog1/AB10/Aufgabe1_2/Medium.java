package ProgWiederholung.Prog1.AB10.Aufgabe1_2;

public abstract class Medium {
    private String titel;
    private int nr;
    public boolean ausgeliehen;
    private Nutzer ausgeliehenVon;

    private static int neueNr = 1;

    public Medium(String titel) {
        this.titel = titel;
        this.nr = neueNr++;
        this.ausgeliehen = false;
    }

    public int nr() {
        return this.nr;
    }

    public String getTitel() {
        return this.titel;
    }

    public Nutzer getAusleiher() {
        return ausgeliehenVon;
    }

    public boolean istAusgeliehen() {
        return this.ausgeliehen;
    }

    public void ausleihen(Nutzer nutzer) {
        this.ausgeliehen = true;
        this.ausgeliehenVon = nutzer;
    }

    public void zurueckgeben() {
        this.ausgeliehen = false;
        this.ausgeliehenVon = null;
    }

    public abstract String signatur();

    public String toString() {
        return titel + " (" + signatur() + ")";
    }
}
