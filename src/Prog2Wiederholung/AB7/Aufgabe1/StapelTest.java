package Prog2Wiederholung.AB7.Aufgabe1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class StapelTest {
    @Test
    public void testPushMakeStackNonEmpty() {
        Stapel<Integer> s = new StapelAlsDynArray<>();
        s.push(1);
        assertFalse(s.isEmpty());
    }
    @Test
    public void testTopAfterPush() {
        Stapel<String> s = new StapelAlsDynArray<>();
        s.push("Hallo");
        assertEquals("Hallo", s.top());
    }

    @Test
    public void testTopAfterPushPop() {
        Stapel<String> s = new StapelAlsDynArray<>();
        s.push("Hallo");
        String vorher = s.top();
        s.push("Bye");
        s.pop();
        assertEquals(vorher,s.top());
    }

    @Test
    public void testPushMakeStackNonEmptyEVL() {
        Stapel<String> s = new StapelAlsEVL<>();
        s.push("Hallo");
        System.out.println(s.top()); // → "Hallo"
    }
}
