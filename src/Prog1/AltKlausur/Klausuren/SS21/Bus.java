package Prog1.AltKlausur.Klausuren.SS21;

public class Bus extends Personentransport {
    private double dauer;

    public static int neueNr = 1;

    public Bus(double dauer, int plaetze) {
        super("Bus" + neueNr++,plaetze);
        //this.dauer = dauer;
    }

    public double getDauer() {
        return this.dauer;
    }

    public void setDauer(double neu) {
        this.dauer = neu;
    }


    public double gesamtdauer(int kilometer) {
        return dauer * kilometer;
    }
}
