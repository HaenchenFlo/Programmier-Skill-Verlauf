package ProgWiederholung.Prog1.AB10.Aufgabe1_2;

public class Buch extends Medium {
    public Buch(String titel) {
        super(titel);
    }


    @Override
    public String signatur() {
        return "B" + super.nr();
    }
}
