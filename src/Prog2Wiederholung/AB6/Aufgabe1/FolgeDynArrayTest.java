package Prog2Wiederholung.AB6.Aufgabe1;

import Prog2Wiederholung.AB6.Folge;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author akless
 * @licence MIT
 */

public class FolgeDynArrayTest {

    /* Instanzvariablen */

    private Folge<String> uut;

    /* Instanzmethoden */

    @BeforeEach
    public void init() {
        uut = new FolgeAlsDynArray<>();
    }

    @Test
    public void testInsertAndDelete() {
        uut.insert(0, "A");          // [A]
        assertEquals(1, uut.size());
        assertEquals("A", uut.get(0));

        uut.insert(1, "B");          // [A, B]
        assertEquals(2, uut.size());
        assertEquals("B", uut.get(1));

        uut.insert(1, "C");          // [A, C, B]
        assertEquals(3, uut.size());
        assertEquals("C", uut.get(1));
        assertEquals("B", uut.get(2));

        uut.delete("C");             // [A, B]
        assertEquals(2, uut.size());
        assertEquals("A", uut.get(0));
        assertEquals("B", uut.get(1));

        uut.remove(0);               // [B]
        assertEquals(1, uut.size());
        assertEquals("B", uut.get(0));

        uut.delete("B");             // []
        assertEquals(0, uut.size());
    }

}
