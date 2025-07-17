package Prog2Wiederholung.AB8.Aufgabe2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudTest {
    @Test
    public void testCompareTo_smaller() {
        Stud s1 = new Stud("Florian");
        Stud s2 = new Stud("Helena");

        assertTrue(s1.compareTo(s2) < 0);
    }

    @Test
    public void testCompareTo_bigger() {
        Stud s1 = new Stud("Hannah");
        Stud s2 = new Stud("Alec");

        assertTrue(s2.compareTo(s1) > 0);
    }
}
