package Prog1.AB9.Aufgabe3;

public class Manager extends Mitarbeiter{
    public double gehalt;

    public Manager(String name, int gebJahr,double gehalt) {
        super(name, gebJahr);

        this.gehalt = gehalt;
    }

    public void setGehalt(double neuesG) {
        this.gehalt = neuesG;
    }

    @Override
    public double getGehalt() {
        return gehalt;
    }
}
