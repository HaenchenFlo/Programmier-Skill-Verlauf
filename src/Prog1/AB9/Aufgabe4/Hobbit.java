package Prog1.AB9.Aufgabe4;

public class Hobbit extends SterblicheWesen {

    public Hobbit(String name, int alter) {
        super(name, alter, 150);
    }


    @Override
    public String gruss() {
        return "Hallo!";
    }
}
