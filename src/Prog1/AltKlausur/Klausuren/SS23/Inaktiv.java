package Prog1.AltKlausur.Klausuren.SS23;

public class Inaktiv extends Mitglied {

    private static double beitrag = 20.0;

    private double spende;

    public Inaktiv(String name, int gebJahr) {
        super(name, gebJahr);
        spende = 0;
    }

    public void spenden(double spende) {
        this.spende += spende;
    }

    public void setBeitrag(double neu) {
        beitrag = neu;
    }

    public double beitrag() {
        return beitrag + spende;
    }
}
