package ProgWiederholung.Prog1.AB10.Aufgabe1_2;

public class DVD extends Medium {
    private int FSK;

    public DVD(String titel,int FSK) {
        super(titel);
        this.FSK = FSK;
    }

    public int getFSK() {
        return FSK;
    }

    @Override
    public String signatur() {
        return "DVD" + super.nr();
    }
}
