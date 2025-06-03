package Prog1.AB9.Aufgabe4;

public abstract class SterblicheWesen extends Wesen{
    public int lebensErwartung;

    public SterblicheWesen(String name, int alter, int lebensErwartung) {
        super(name, alter);
        this.lebensErwartung = lebensErwartung;
    }

    @Override
    public boolean lebendig() {
        if(alter < lebensErwartung) {
            return true;
        }
        return false;
    }

    public void wirdVerwundet(int schaden) {
        if(schaden >= lebensErwartung) {
            System.out.println(this.name  + " stirbt!");
        } else {
            lebensErwartung -= schaden;
            System.out.println(this.name + "´s Lebenserwartung sinkt um " + schaden + " Jahre");
        }
    }

    public String toString() {
        if(!lebendig()) {
            return "Name: " + name + ", Alter: " + alter + ", bereits verstorben";
        }
        return "Name: " + name + ", Alter: " + alter + ", Lebenserwartung: " + lebensErwartung;

    }
}
