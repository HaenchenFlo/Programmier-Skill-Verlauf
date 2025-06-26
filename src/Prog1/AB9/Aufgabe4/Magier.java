package Prog1.AB9.Aufgabe4;

import Prog1.AB11.Aufgabe3.Gegenstand;
import Prog1.AB11.Aufgabe3.Tragbar;

public class Magier extends Wesen{

    public Magier(String name, int alter) {
        super(name,alter);
    }

    @Override
    public boolean lebendig() {
        return true;
    }

    @Override
    public String gruss() {
        return "Sei gegruesst!";
    }

    @Override
    public void nehmen(Tragbar d) {
        if (this.ding != null) {
            System.out.println(name + " trägt bereits etwas.");
            return;
        }
        this.ding = d;
        System.out.println(name + " trägt jetzt " + ((Gegenstand) d).getBezeichnung());
    }

    public void heilt(Hobbit h) {
        if(h.lebendig()) {
            h.lebensErwartung = 150;
            System.out.println("Hobbit " + h.name + " wird geheilt und die Lebenserwartung ist wieder 150");
        } else {
            System.out.println("Hobbit " + h.name + " ist bereits verstorben");
        }
    }
}
