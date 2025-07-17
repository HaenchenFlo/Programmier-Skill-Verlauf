package Prog2Wiederholung.AB1.Aufgabe2;

public abstract class GeoObjekt implements Verschiebbar {
    private String farbe;

    public String farbe() {
        return farbe;
    }

    public void setFarbe(String f) {
        this.farbe = f;
    }
}
