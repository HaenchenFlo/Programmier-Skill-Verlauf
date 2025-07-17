package Prog2Wiederholung.AB5.Aufgabe3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DynArrayWITest {

    @Test
    public void testInsertAndSize() {
        DynArrayWI<String> dynArray = new DynArrayWI<>();
        assertEquals(0, dynArray.size());

        dynArray.insert("A");
        dynArray.insert("B");
        dynArray.insert("C");

        assertEquals(3, dynArray.size());
        assertTrue(dynArray.contains("B"));
        assertFalse(dynArray.contains("Z"));
    }

    @Test
    public void testDelete() {
        DynArrayWI<String> dynArray = new DynArrayWI<>();
        dynArray.insert("X");
        dynArray.insert("Y");

        assertTrue(dynArray.contains("Y"));
        dynArray.delete("Y");
        assertFalse(dynArray.contains("Y"));
        assertEquals(1, dynArray.size());
    }

    @Test
    public void testGet() {
        DynArrayWI<String> dynArray = new DynArrayWI<>();
        dynArray.insert("Apple");
        dynArray.insert("Banana");

        String element = dynArray.get(0); // je nach Implementierung evtl. erstes oder letztes
        assertNotNull(element);
        assertTrue(element.equals("Apple") || element.equals("Banana")); // abhängig von get()
    }

    @Test
    public void testIterator() {
        DynArrayWI<Integer> dynArray = new DynArrayWI<>();
        dynArray.insert(1);
        dynArray.insert(2);
        dynArray.insert(3);

        int sum = 0;
        for (int num : dynArray) {
            sum += num;
        }

        assertEquals(6, sum);
    }
}
