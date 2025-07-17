package Prog2Wiederholung.AB4.Aufgabe3;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import Prog2Wiederholung.AB3.Aufgabe3.Menge;
import Prog2Wiederholung.AB4.Aufgabe2.EVL;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

class EVLTest {

	static EVL<Integer> liste1;
	static EVL<String> liste2;
	static EVL<Integer> leer;
	
	@BeforeEach
	void init() {
		liste1 = new EVL<>();
		for (int i = 1; i <= 5; i++) {
			liste1.insert(10+i);
		}

		liste2 = new EVL<>();
		liste2.insert("eins");
		liste2.insert("zwei");
		liste2.insert("drei");
		
				
		leer = new EVL<>();
	}

	@Test
	void testEmpty() {
		testEmpty(leer);
		}
		
	static <T> void testEmpty(EVL<T> liste) {
    	assertTrue(liste.isEmpty());
    	assertEquals(0, liste.size());
		assertThrows(NoSuchElementException.class, ()->{liste.getFirst();});
	}
	
    @Test
    void testInit() {
    	assertFalse(liste1.isEmpty());
    	assertEquals(5, liste1.size());
    	assertEquals(15, liste1.getFirst());
    	
    	System.out.println(liste1.toString());
    	assertFalse(liste2.isEmpty());
    	assertEquals(3, liste2.size());
    	assertEquals("drei", liste2.getFirst());
    	System.out.println(liste2.toString());
    }

	@Test
	void testDeleteExisting() {
		assertEquals(5, liste1.size());
		liste1.delete(13); // Element in der Mitte
		assertEquals(4, liste1.size());
		assertFalse(liste1.contains(13));
	}


	@Test
	void testDeleteNonExisting() {
		assertEquals(5, liste1.size());
		liste1.delete(99); // nicht vorhanden
		assertEquals(5, liste1.size()); // keine Änderung
	}

	@Test
	void testDeleteFirst() {
		int first = liste1.getFirst();
		liste1.delete(first);
		assertNotEquals(first, liste1.getFirst());
		assertEquals(4, liste1.size());
	}

	@Test
	void testDeleteFromEmpty() {
		leer.delete(42); // darf nicht crashen
		assertTrue(leer.isEmpty());
	}


	@Test
	void testDeleteAllElements() {
		while (!liste2.isEmpty()) {
			String first = liste2.getFirst();
			liste2.delete(first);
		}
		assertTrue(liste2.isEmpty());
		assertEquals(0, liste2.size());
	}

	@Test
	void testInsertNoDuplicates() {
		Menge<Integer> menge = new MengeEVL<>();
		menge.insert(1);
		menge.insert(1);
		menge.insert(1);

		assertEquals(1, menge.size()); // Nur ein Element erlaubt
		assertTrue(menge.contains(1));
	}

}
