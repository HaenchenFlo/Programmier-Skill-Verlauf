package Prog1.AB9.Aufgabe4;

public class MittelerdeTest {

    public static void main(String[] args) {
        Wesen[] wesenListe = new Wesen[3];

        Hobbit frodo = new Hobbit("Frodo", 33);
        Magier gandalf = new Magier("Gandalf", 2019);
        Hobbit sam = new Hobbit("Sam", 38);

        wesenListe[0] = frodo;
        wesenListe[1] = gandalf;
        wesenListe[2] = sam;

        System.out.println("Status vor Verwundung und Heilung:");
        status(wesenListe);

        // Frodo verwunden
        frodo.wirdVerwundet(30);
        frodo.wirdVerwundet(50);

        // Gandalf heilt Frodo
        gandalf.heilt(frodo);

        // Sam tödlich verwunden
        sam.wirdVerwundet(111);

        gandalf.heilt(sam);

        sam.wirdVerwundet(150);

        System.out.println("\nStatus nach Verwundung und Heilung:");
        status(wesenListe);
    }

    public static void status(Wesen[] wesenArray) {
        for (Wesen w : wesenArray) {
            System.out.println(w.gruss());
            System.out.println(w.toString());
            System.out.println("Lebendig: " + w.lebendig());
            System.out.println();
        }
    }
}
