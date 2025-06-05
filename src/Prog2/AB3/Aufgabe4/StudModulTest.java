package Prog2.AB3.Aufgabe4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudModulTest {

    Modul prog;
    Student anna;
    Student ben;

    @BeforeEach
    void setup() {
        prog = new Modul("Programmieren", 6);
        anna = new Student("Anna", 2000);
        ben = new Student("Ben", 1999);
    }

    @Test
    void testAnmelden() {
        anna.anmelden(prog);
        ben.anmelden(prog);

        // Zugriff auf Teilnehmerliste nur für den Test: Annahme du hast eine Methode z. B.:
        // public boolean istAngemeldet(Student s) => return teilnehmer.contains(s);
        assertTrue(prog.istAngemeldet(anna));
        assertTrue(prog.istAngemeldet(ben));
    }

    @Test
    void testAbmelden() {
        anna.anmelden(prog);
        anna.abmelden(prog);

        assertFalse(prog.istAngemeldet(anna));
    }

    @Test
    void testDoppeltAnmeldenHatKeineWirkung() {
        anna.anmelden(prog);
        anna.anmelden(prog);  // zweite Anmeldung

        // Teilnehmergröße sollte 1 bleiben
        assertEquals(1, prog.getAnzahlTeilnehmer());
    }
}
