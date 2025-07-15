package Prog1.AltKlausur.Klausuren.SS22;

public class Manager extends Mitarbeiter {
    private double gehalt;

    public Manager(String name,int gebJahr,double gehalt) {
        super(name, gebJahr);
        this.gehalt = gehalt;
    }

    public void setGehalt(double neu) {
        this.gehalt = neu;
    }

    public double gehalt() {
        return gehalt;
    }
}
