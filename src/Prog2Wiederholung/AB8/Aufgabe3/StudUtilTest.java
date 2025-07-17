package Prog2Wiederholung.AB8.Aufgabe3;

import Prog2Wiederholung.AB3.Aufgabe3.Menge;
import Prog2Wiederholung.AB4.Aufgabe3.MengeEVL;
import Prog2Wiederholung.AB6.Folge;
import Prog2Wiederholung.AB8.Aufgabe2.Stud;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudUtilTest {
    @Test
    public void testSort() {
        Menge<Stud> menge = new MengeEVL<>();  // oder andere Implementierung

        menge.insert(new Stud("Berta")); // 100
        menge.insert(new Stud("Anna"));  // 101
        menge.insert(new Stud("Clara")); // 102

        Folge<Stud> sorted = StudUtil.sort(menge);

        assertEquals("Berta", sorted.get(0).name());
        assertEquals("Anna", sorted.get(1).name());
        assertEquals("Clara", sorted.get(2).name());
    }

}
