package Prog1.AltKlausur.Klausuren.SS23;

public class Aufgabe6 {
    public static void erfasseDaten(String s, int n) throws PersonException {
        if(s == null || s == "") {
            throw new PersonException("String darf nicht leer sein");
        }
        if(n > 2023) {
            throw new PersonException("Zahl muss kleiner als 2023 sein");
        }
    }

    public static Person createPerson(String s, int n) throws PersonException {
        erfasseDaten(s,n);
        return new Person(s,n);
    }

    public static void main(String[] args) {
        try {
            createPerson("Florian", 2003);
        } catch (PersonException e) {
            System.out.println(e.getMessage());
        }
    }
}
