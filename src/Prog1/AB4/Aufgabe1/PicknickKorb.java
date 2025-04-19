package Prog1.AB4.Aufgabe1;

public class PicknickKorb {
    private static double kaesePreis = 14.90;
    private static double weinPreis = 6.75;
    private double kaese;
    private int weinFlaschen;

    public PicknickKorb(double kaese, int weinFlaschen) {
        this.kaese = kaese;
        this.weinFlaschen = weinFlaschen;
    }

    public void setKaesePreis(double neuerPreis) {
        kaesePreis = neuerPreis;
    }

    public void setWeinPreis(double neuerPreis) {
        weinPreis = neuerPreis;
    }

    public double getKaesePreis() {
        return kaesePreis;
    }

    public double getWeinPreis() {
        return weinPreis;
    }

    public double berechneKaese() {
        return this.kaese * kaesePreis;
    }

    public double berecheWein() {
        return this.weinFlaschen * weinPreis;
    }

    public double berechneKorb() {
        return berecheWein() + berechneKaese();
    }
}
