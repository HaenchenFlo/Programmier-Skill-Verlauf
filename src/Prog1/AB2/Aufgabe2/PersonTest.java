package Prog1.AB2.Aufgabe2;

public class PersonTest {
    public static void main(String[] args) {
        Person p;  // erzeugt Variable
        p = new Person();  // erzeugt "leere Karteikarte"
        p.name = "Anna";  // belegt Feld in der Karteikarte
        p.gebJahr = 2000;
        int b = p.alter(2065);
        System.out.println("Alter von Person p im Jahr 2065: " + b);
        System.out.println(p.gruss());

        Person o;  // erzeugt Variable
        o = new Person();  // erzeugt "leere Karteikarte"
        o.name = "Florian";  // belegt Feld in der Karteikarte
        o.gebJahr = 2003;
        int c = o.alter(2025);
        System.out.println("Alter von Person o im Jahr 2025: " + c);
        System.out.println(o.gruss());

    }
}
