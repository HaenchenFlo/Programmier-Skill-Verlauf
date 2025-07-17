package Prog2Wiederholung.AB2.Aufgabe2;

import Prog2Wiederholung.AB2.Aufgabe1.Paar;

public class KindTest {

    public static Paar<Kind, Paar<Person, Person>> family(Kind k) {
        return new Paar<>(k, k.getEltern());
    }

    public static int dAlter(Paar<Kind, Paar<Person, Person>> family) {
        Kind kind = family.erstes();
        Paar<Person, Person> eltern = family.zweites();

        int gebJahrKind = kind.gebJahr();
        int gebJahrVater = eltern.erstes().gebJahr();
        int gebJahrMutter = eltern.zweites().gebJahr();

        int vaterAlter = gebJahrKind - gebJahrVater;
        int mutterAlter = gebJahrKind - gebJahrMutter;

        return (vaterAlter + mutterAlter) / 2;
    }


    public static void main(String[] args) {
        Person Marge = new Person("Marge", 1972);
        Person Homer = new Person("Homer", 1970);
        Person AbeDad = new Person("AbeDad", 1909);
        Person AbeMom = new Person("AbeMom", 1919);
        Person HerbMom = new Person("HerbMom", 1929);

        Kind Lisa = new Kind("Lisa",2000,new Paar<>(Homer,Marge));
        Kind Bart = new Kind("Bart", 2000, new Paar<>(Homer, Marge));

        Kind Abe = new Kind("Abe", 1930, new Paar<>(AbeDad,AbeMom));
        Kind Herb = new Kind("Herb", 1969, new Paar<>(Abe,HerbMom));

        System.out.println("Sind Bart und Lisa geschwister? : " + Kind.geschwister(Lisa, Bart));
        System.out.println("Sind Abe und Herb geschwister? : " + Kind.geschwister(Abe, Herb));
        System.out.println(Bart);
        System.out.println(Lisa);
        System.out.println(Herb);
        System.out.println(Abe);

        System.out.println(family(Bart));
        System.out.println(dAlter(family(Bart)));
    }

}
