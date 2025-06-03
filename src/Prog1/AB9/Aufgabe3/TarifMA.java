package Prog1.AB9.Aufgabe3;

public class TarifMA extends Mitarbeiter {
    public int gehaltStufe;
    public static double grundGehalt = 1250;
    public static double stufenAufschlag = 300;
    public double provision;


    public TarifMA(String name, int gebJahr,int gehaltStufe) {
        super(name, gebJahr);
        this.gehaltStufe = gehaltStufe;
        provision = 0;
    }

    public double getGrundgehalt() {
        return grundGehalt;
    }

    public double getStufenAufschlag() {
        return stufenAufschlag;
    }

    public double getProvision() {
        return provision;
    }

    public void setGrundGehalt(double neuesGG) {
        grundGehalt = neuesGG;
    }

    public void setStufenAufschlag(double neuesSA) {
        stufenAufschlag = neuesSA;
    }

    public void aufsteigen() {
        if(gehaltStufe < 12) {
            gehaltStufe++;
        }
    }


    @Override
    public double getGehalt() {
        return grundGehalt + gehaltStufe * stufenAufschlag + provision;
    }
}
