package Prog2.AB3.Aufgabe3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MengeDynArrayTest {

    private MengeDynArray<Integer> menge;

    @BeforeEach
    public void setup() {
        menge = new MengeDynArray<>();
        menge.insert(10);
        menge.insert(20);
        menge.insert(30);
    }

    @Test
    public void testInsertAndSize() {
        assertEquals(3, menge.size());
        menge.insert(40);
        assertEquals(4, menge.size());
        menge.insert(10); // schon drin
        assertEquals(4, menge.size()); // kein Duplikat
    }

    @Test
    public void testContains() {
        assertTrue(menge.contains(10));
        assertFalse(menge.contains(100));
    }

    @Test
    public void testDelete() {
        menge.delete(20);
        assertFalse(menge.contains(20));
        assertEquals(2, menge.size());
    }

    @Test
    public void testDeleteFirstLastMiddle() {
        menge.insert(40);
        menge.insert(50);

        menge.delete(10); // erster
        assertFalse(menge.contains(10));

        menge.delete(30); // mittlerer
        assertFalse(menge.contains(30));

        menge.delete(50); // letzter
        assertFalse(menge.contains(50));
    }

    @Test
    public void testGet() {
        assertEquals(10, menge.get()); // irgendein Element, meist das erste
    }


    @Test
    public void testIsEmpty() {
        assertFalse(menge.isEmpty());
        menge.delete(10);
        menge.delete(20);
        menge.delete(30);
        assertTrue(menge.isEmpty());
    }
}
