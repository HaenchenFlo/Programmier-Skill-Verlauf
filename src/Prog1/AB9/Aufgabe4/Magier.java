package Prog1.AB9.Aufgabe4;

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

    public void heilt(Hobbit h) {
        if(h.lebendig()) {
            h.lebensErwartung = 150;
            System.out.println("Hobbit " + h.name + " wird geheilt und die Lebenserwartung ist wieder 150");
        } else {
            System.out.println("Hobbit " + h.name + " ist bereits verstorben");
        }
    }
}
