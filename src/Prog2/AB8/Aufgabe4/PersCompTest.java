package Prog2.AB8.Aufgabe4;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

import Prog2.AB1.Aufgabe1.Person;

import static org.junit.jupiter.api.Assertions.*;

public class PersCompTest {
    @Test
    public void testCompare() {
        Person p1 = new Person("Anna", 1990);
        Person p2 = new Person("Anna", 1985);
        Person p3 = new Person("Bernd", 1995);
        Person p4 = new Person("Zoe", 2000);

        List<Person> personen = Arrays.asList(p4, p3, p2, p1);
        Collections.sort(personen, new PersComparator());

        assertEquals("Anna (1985)", personen.get(0).toString());
        assertEquals("Anna (1990)", personen.get(1).toString());
        assertEquals("Bernd (1995)", personen.get(2).toString());
        assertEquals("Zoe (2000)", personen.get(3).toString());
    }
}
