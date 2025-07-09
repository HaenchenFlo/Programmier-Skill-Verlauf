package Prog1.AltKlausur.Klausuren.SS23;

public class Aktiv extends Mitglied {
    private static double beitrag = 75.0;
    private static double verguetung = 5.0;

    private int std;

    public Aktiv(String name, int gebJahr){
        super(name, gebJahr);
        this.std = 0;
    }

    public void arbeiten(int std) {
        this.std += std;
    }

    public void setBeitrag(double neu) {
        beitrag = neu;
    }

    public void setVerguetung(double neu) {
        verguetung = neu;
    }

    public double beitrag() {
        double beitragInsg = beitrag - (std * verguetung);
        if(beitragInsg < 0) {
            return 0.0;
        }
        return beitragInsg;
    }
}
