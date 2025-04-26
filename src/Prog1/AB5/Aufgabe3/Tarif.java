package Prog1.AB5.Aufgabe3;

public class Tarif {
    private static double grundGebuehr = 12.50;

    private double preisProGB;
    private int freiGB;

    public Tarif(int freiGB, double preisProGB) {
        this.freiGB = freiGB;
        this.preisProGB = preisProGB;
    }

    public void setGrundGebuehr(double neu) {
        grundGebuehr = neu;
    }

    public double rechnung(int verbrauchGB){
        if(verbrauchGB <= freiGB) {
            return grundGebuehr;
        } else {
            int extraGB = verbrauchGB - freiGB ;
            return grundGebuehr + extraGB * preisProGB;
        }
    }
}
