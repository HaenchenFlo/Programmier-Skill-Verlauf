package Prog1.AltKlausur.Klausuren.SS22;

public class TarifMA extends Mitarbeiter {
    private int gehaltStufe;
    private double provision;


    private static double grundGehalt = 1250.00;
    private static double zuschlag = 300.00;

    public TarifMA(String name, int gebJahr, int gehaltStufe) {
        super(name, gebJahr);
        this.provision = 0.0;
        this.gehaltStufe = gehaltStufe;
    }


    public static void setGrundGehalt(double neu) {
        grundGehalt = neu;
    }

    public static void setZuschlag(double neu) {
        zuschlag = neu;
    }

    public void setProvision(double neu) {
        this.provision = neu;
    }

    public double getProvision() {
        return this.provision;
    }

    public static double getZuschlag() {
        return zuschlag;
    }

    public static double getGrundGehalt() {
        return grundGehalt;
    }

    public int getGehaltStufe() {
        return this.gehaltStufe;
    }

    public void aufsteigen() {
        if(gehaltStufe < 12) {
            gehaltStufe++;
        }
    }

    @Override
    public double gehalt() {
        return grundGehalt + gehaltStufe * zuschlag + provision;
    }
}
