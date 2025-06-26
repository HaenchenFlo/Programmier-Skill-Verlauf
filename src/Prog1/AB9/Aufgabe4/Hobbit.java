package Prog1.AB9.Aufgabe4;

import Prog1.AB11.Aufgabe3.Gegenstand;
import Prog1.AB11.Aufgabe3.Tragbar;

public class Hobbit extends SterblicheWesen {

    public Hobbit(String name, int alter) {
        super(name, alter, 150);
        this.geldbeutel = 1000;
    }


    @Override
    public String gruss() {
        return "Hallo!";
    }

    @Override
    public void nehmen(Tragbar d) {
        if (this.ding != null) {
        System.out.println(name + " trägt bereits " + ((Gegenstand) ding).getBezeichnung() + " und kann nichts weiteres nehmen.");
        return;
    }

        if (d.gewicht() <= 20) {
            this.ding = d;
            System.out.println(name + " trägt jetzt " + ((Gegenstand) d).getBezeichnung());
        } else {
            System.out.println(name + " kann das nicht tragen.");
        }
    }
}
