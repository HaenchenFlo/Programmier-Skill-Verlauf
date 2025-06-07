package Prog2.AB5.Aufgabe1;

public class TestPostbote {
    public static void main(String[] args) {
        // Index 0 bleibt leer!
        Person[] strasse = new Person[5]; // Häuser 1–4
        strasse[1] = new Person("Anna");
        strasse[2] = new Person("Ben");
        strasse[3] = new Person("Chris");
        strasse[4] = new Person("Didi");

        System.out.println("Besuch vom Postboten:");
        PostbotenIterator<Person> it = new PostbotenIterator<>(strasse);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("\n ------------------------------------ \n");
        weitereTests();
    }

    public static void weitereTests() {
        // Nur ein bewohntes Haus:
        Person[] einsam = new Person[3];
        einsam[1] = new Person("Lena");

        System.out.println("Einsames Haus:");
        PostbotenIterator<Person> it2 = new PostbotenIterator<>(einsam);
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

// Ungerade Anzahl Häuser (z.B. 5 Häuser):
        Person[] strasse2 = new Person[6]; // Häuser 1–5
        strasse2[1] = new Person("Anna");
        strasse2[2] = new Person("Ben");
        strasse2[3] = new Person("Chris");
        strasse2[4] = new Person("Didi");
        strasse2[5] = new Person("Ella");

        System.out.println("Unrunde Straße:");
        PostbotenIterator<Person> it3 = new PostbotenIterator<>(strasse2);
        while (it3.hasNext()) {
            System.out.println(it3.next());
        }
    }
}
