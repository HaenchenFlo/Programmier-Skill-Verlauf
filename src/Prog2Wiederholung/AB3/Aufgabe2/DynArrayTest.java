package Prog2Wiederholung.AB3.Aufgabe2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DynArrayTest {
	
	static DynArray<Integer> da;
	static DynArray<String> sa;
	
	
	@BeforeEach
	void init() {
		da = new DynArray<>();
		sa = new DynArray<>();
		for (int i = 0; i <= 4; i++) {
			da.add(i+10);
		}
		da.add(12);
	}
	
	@Test
	void testAdd() {
		int s = da.size();
		da.add(20);
		assertEquals(s+1, da.size());
		assertTrue(sa.isEmpty());
		sa.add("hey");
		assertEquals("hey", sa.get(0));
	}

	
	@Test
	void testBounds() {
		assertThrows(IndexOutOfBoundsException.class, ()->{da.get(10);});
		assertThrows(IndexOutOfBoundsException.class, ()->{da.get(-3);});
		assertThrows(IndexOutOfBoundsException.class, ()->{sa.set(1, "Hey");});
	}
	
	@Test
	void testGetSet() {
		assertEquals(12, da.get(2));
		int s = da.size();
		da.set(3,  20);
		assertEquals(s, da.size());
		assertEquals(20, da.get(3));
		assertEquals(s, da.size());
	}
	// Test für die delete-Methode, wenn das Element in der Mitte ist
	@Test
	void testDeleteMiddleElement() {
		// Vorheriges Array: [10, 11, 12, 13, 14, 12]
		da.delete(12); // Löscht das erste Vorkommen von 12

		// Teste, ob das erste Vorkommen entfernt wurde
		assertEquals(5, da.size()); // Größe sollte jetzt 5 sein
	}

	// Test für die delete-Methode, wenn das Element mehrfach vorkommt
	@Test
	void testDeleteMultipleOccurrences() {
		// Füge ein weiteres Vorkommen von 12 hinzu
		da.add(12); // Jetzt ist das Array: [10, 11, 12, 13, 14, 12]

		da.delete(12); // Löscht das erste Vorkommen von 12

		assertTrue(da.contains(12)); // Das zweite Vorkommen von 12 sollte noch da sein
	}

	// Test für das Löschen des ersten Elements
	@Test
	void testDeleteFirstElement() {
		// Vorheriges Array: [10, 11, 12, 13, 14]
		da.delete(10); // Löscht das erste Element (10)

		// Teste, ob das erste Element entfernt wurde
		assertEquals(5, da.size()); // Die Größe ist immer noch 5
		assertFalse(da.contains(10)); // 10 sollte nicht mehr enthalten sein
	}

	// Test für das Löschen des letzten Elements
	@Test
	void testDeleteLastElement() {
		// Vorheriges Array: [10, 11, 12, 13, 14]
		da.delete(14); // Löscht das letzte Element (14)

		// Teste, ob das letzte Element entfernt wurde
		assertEquals(5, da.size()); // Die Größe sollte 5 bleiben
		assertFalse(da.contains(14)); // 14 sollte nicht mehr enthalten sein
	}

	// Test, wenn das zu löschende Element nicht existiert
	@Test
	void testDeleteNonExistentElement() {
		// Vorheriges Array: [10, 11, 12, 13, 14]
		da.delete(99); // Löscht ein nicht existierendes Element

		// Teste, dass das Array unverändert bleibt
		assertEquals(6, da.size()); // Die Größe bleibt 6
		assertTrue(da.contains(10)); // 10 sollte immer noch enthalten sein
	}

	@Test
	void testIncreaseArraySize() {
		// Vorheriges Array mit einer Kapazität von 2
		int initialCapacity = da.capacity();

		// Füge 6 Elemente hinzu (das Array sollte seine Kapazität verdoppeln)
		for (int i = 0; i < 6; i++) {
			da.add(i + 20);
		}

		// Die Kapazität des Arrays sollte mindestens 12 sein, nachdem 6 Elemente hinzugefügt wurden
		assertTrue(da.capacity() >= 12, "Die Kapazität wurde nicht richtig erhöht.");
	}

	// Test für die decrease Methode
	@Test
	void testDecreaseArraySize() {
		// Vor dem Löschen sollten wir mindestens 12 Elemente haben
		for (int i = 0; i < 10; i++) {
			da.add(i + 10); // Füge 10 Elemente hinzu (Array wird mindestens Kapazität 12 haben)
		}

		// Lösche jetzt einige Elemente, sodass die Kapazität verringert werden sollte
		for (int i = 0; i < 6; i++) {
			da.remove(); // Löscht Elemente (Array sollte jetzt zu weniger als 25% gefüllt sein)
		}

		// Teste, ob die Kapazität nicht unter der Startgröße von 2 gesenkt wurde
		assertTrue(da.capacity() >= 2, "Die Kapazität wurde unter die Startgröße reduziert.");
	}


}
