package Prog2Wiederholung.AB4.Aufgabe2;

import java.util.NoSuchElementException;


/** @author fhaenc2s
 * 
 *
 * @param <T>
 * @version SoSe25
 * 
 * EVL 
	 *    implementiert die Methoden
	 *    	 int size()
	 *       boolean isEmpty()
	 *       T get()
	 *       void insert(T v)
	 *       void remove()
	 *       boolean contains(T v)
	 *       void delete(T v)
 */

public class EVL<T> {
	
	private ListenElem first;
	private int size;
	
	// innere Klasse /////////////////////////
	protected class ListenElem {
		T value;
		ListenElem next;
		
		ListenElem (T v) {
			value = v;
			next = null;
		}
	}
	
	// Konstruktor /////////////////////////
	
	public EVL() {
		this.first = null;
		this.size = 0;
	}
		
	// Methoden ///////////////////////////////
		
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}

	public T getFirst () throws NoSuchElementException {
		if(isEmpty()) {
			throw new NoSuchElementException("Liste Leer");
		}
		return first.value;
	}

	public T getLast() {
		ListenElem cursor = first;
		if(isEmpty()) {
			throw new NoSuchElementException("Liste Leer");
		}
		while(cursor.next != null) {
			cursor = cursor.next;
		}
		return cursor.value;
	}
	
	public void insert(T v) {
		// fuegt vorne ein
		ListenElem neu = new ListenElem(v);
		neu.next = first;
		first = neu;
		size++;
	}
	
	public void removeFirst() {
		// entfernt das vorderste Element

		// Sonderfall: leere Liste
		if (isEmpty()) 
			return;
		
		// Normalfall
		first = first.next;
		size--;
	}
	
	public boolean contains(T v) {
		ListenElem e = first;
		
		// suche Element e mit Eintrag v
		while(e != null && !e.value.equals(v)) {
			e = e.next;
		}
		return (e != null);
	}
	

	public void delete(T v) {
		// entfernt das erste Vorkommen eines Elements mit Eintrag v
		
		// Sonderfall: leere Liste
		if(isEmpty())
			return;
		
		ListenElem e = first;  // Cursor, Ziel: e = v
		ListenElem tmp = first;  // Vorgaenger von e, dh tmp.next = e
		
		// suche Element e mit Eintrag v
		while(e != null && !e.value.equals(v)) {
			tmp = e; 
			e = e.next;
		}
		
		// Sonderfall: e = erstes Elem
		if(e == first) {
			removeFirst();
			return;
		}
		
		// Sonderfall: v nicht gefunden
		if (e == null)
			return;
		
		// Normalfall:
		tmp.next = e.next;
		size--;
		
	}

	public void append(T v) {
		ListenElem neu = new ListenElem(v);
		if(isEmpty()) {
			first = neu;
		} else {
			ListenElem cursor = first;
			while (cursor.next != null) {
				cursor = cursor.next;
			}
			cursor.next = neu;
			size++;
		}
	}
	
	@Override
	public String toString() {
		// values von "vorne nach hinten" in einer Zeile
		// nicht f�r komplexen Komponententyp T geeignet
		String s = "";
		ListenElem tmp = first;
		while (tmp!= null) {
			s += tmp.value.toString() + " ";
			tmp = tmp.next;
		}
		return s;
	}
		
}
