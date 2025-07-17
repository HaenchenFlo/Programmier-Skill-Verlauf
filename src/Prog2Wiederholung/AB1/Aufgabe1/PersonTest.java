package Prog2Wiederholung.AB1.Aufgabe1;

public class PersonTest {
    public static void main(String[] args) {
        // Erstelle einige Personen
        Person person1 = new Person("Max", 1990);
        Person person2 = new Person("Anna", 1995);

        // Erstelle einige Studenten
        Stud student1 = new Stud("John", 2000);
        Stud student2 = new Stud("Marie", 1998);

        // Erstelle einige Sportler
        Sportler boxer1 = new Boxer("Mike", 1985, 180, 95);
        Sportler fußballer1 = new Fussballer("Toni", 1992, 175, 70, "FC Bayern", true);

        // Ausgabe der Objekte
        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);

        System.out.println("Student 1: " + student1);
        System.out.println("Student 2: " + student2);

        System.out.println("Boxer 1: " + boxer1);
        System.out.println("Fußballer 1: " + fußballer1);

        // Ausgabe der info-Methode für die Sportler
        System.out.println("Info Boxer 1: " + boxer1.info());
        System.out.println("Info Fußballer 1: " + fußballer1.info());
    }
}
