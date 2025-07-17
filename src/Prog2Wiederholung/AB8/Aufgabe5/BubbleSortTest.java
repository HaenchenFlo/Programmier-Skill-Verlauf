package Prog2Wiederholung.AB8.Aufgabe5;

import Prog2Wiederholung.AB6.Aufgabe1.FolgeAlsDynArray;
import Prog2Wiederholung.AB6.Folge;
import Prog2Wiederholung.AB8.Aufgabe4.PersComparator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import Prog2Wiederholung.AB1.Aufgabe1.Person;

public class BubbleSortTest {

    @Test
    public void testBubbleSortMitPersonen() {
        Folge<Person> folge = new FolgeAlsDynArray<>();
        folge.insert(0,new Person("Anna", 1995));
        folge.insert(1,new Person("Bernd", 1990));
        folge.insert(2,new Person("Anna", 1988));
        folge.insert(3,new Person("Clara", 1995));

        SortierUtil.bubbleSort(folge, new PersComparator());

        assertEquals("Anna (1988)", folge.get(0).toString());
        assertEquals("Anna (1995)", folge.get(1).toString());
        assertEquals("Bernd (1990)", folge.get(2).toString());
        assertEquals("Clara (1995)", folge.get(3).toString());
    }
}

