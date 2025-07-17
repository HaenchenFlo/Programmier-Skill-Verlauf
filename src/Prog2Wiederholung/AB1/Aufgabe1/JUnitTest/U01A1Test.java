package Prog2Wiederholung.AB1.Aufgabe1.JUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import Prog2Wiederholung.AB1.Aufgabe1.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class U01A1Test {

	static Person a;
	static Person b;
	static Stud st;
	static Sportler sp;
	static Fussballer ff;
	static Fussballer fb;
	
	
	@BeforeEach
	void init() {
		a = new Person("Anna", 1999);
		b = new Person("Ben", 2002);
		st = new Stud("Anna", 1999);
		sp = new Boxer("Ben", 2002, 180, 100.1);
		ff = new Fussballer("Fritz", 1960, 170, 90.5, "HBRS Kickers", false);
		fb = new Fussballer("Ben", 2002, 180, 100.1, "HBRS Kickers", false);
	}
	
	@Test
	void testInit() {
		assertTrue(a.name().equals("Anna"));
		assertFalse(a.gebJahr() == b.gebJahr());
	}
	
	@Test
	void testEqualsPerson() {
		Person c = a;
		Person d = new Person("Anna", 1999);
		assertFalse(a.equals(b));
		assertTrue(a.equals(c));
		assertTrue(a.equals(d));
		assertTrue(a == c);
		assertFalse(a == d);
	}
	
	@Test
	void testEqualsStud() {
		assertFalse(a.equals(st));
		assertFalse(st.equals(a));
	}
	
 	@Test
	void testEqualsSportler() {
		assertFalse(b.equals(sp));
		assertFalse(sp.equals(b));
		assertFalse(b.equals(fb));
		assertFalse(fb.equals(b));
		assertFalse(fb.equals(sp));
		assertFalse(sp.equals(fb));
		Person c = sp;
		assertTrue(sp.equals(c));
		assertTrue(c.equals(sp));
	}

}
