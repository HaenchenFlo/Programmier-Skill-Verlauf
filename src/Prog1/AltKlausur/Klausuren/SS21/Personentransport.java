package Prog1.AltKlausur.Klausuren.SS21;

public abstract class Personentransport implements Transportmittel {
    private String bez;
    private int plaetze;
    private int belegt;

    public Personentransport(String bez,int plaetze) {
        this.bez = bez;
        this.plaetze = plaetze;
        this.belegt = 0;
    }

    @Override
    public boolean istBuchbar() {
        return belegt < plaetze;
    }

    public void einsteigen() {
        this.belegt++;
    }

    public void aussteigen() {
        this.belegt--;
    }

    public String toString() {
        return "Freie Plätze: " + (plaetze - belegt); // bez
    }
}
