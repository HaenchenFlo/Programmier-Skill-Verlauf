/*
package Prog2.AB1.Aufgabe2.JUnitTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestGeoObjekt {

	static Punkt2D nullP;
	static Punkt2D p11;
	static Punkt2D p34;
	static Punkt2D p2;
	static Kreis k1;
	static Kreis k2;
	static Quadrat q;

	@BeforeEach
	void init() {
		nullP = new Punkt2D();
		p11 = new Punkt2D(1.0, 1.0);
		p34 = new Punkt2D(3.0, 4.0);
		p2 = new Punkt2D(-2.0, -1.0);
		k1 = new Kreis();
		k2 = new Kreis(p2, 2.0);
		q = new Quadrat(p11, -2.0);
	}

	@Test
	void testAbstand() {
		assertEquals(Math.sqrt(13.0), p11.abstand(p34), 0.001);
	}

	@Test
	void testStrecke() {
		Strecke s1 = new Strecke(p11, p34);
		assertEquals(p11, s1.anfp());
		assertEquals(new Punkt2D(3.0, 4.0), s1.endp());
		assertEquals(Math.sqrt(13), s1.laenge());
	}

	@Test
	void testKreisInit() {
		assertEquals(nullP, k1.mittelpunkt());
		assertEquals(1.0, k1.radius());
		assertEquals(2.0, k2.radius());
	}

	@Test
	void testKreisFlaecheUmfang() {
		assertEquals(Math.PI, k1.flaeche());
		assertEquals(2 * Math.PI, k1.umfang());
		k2.multiply(-0.5);
		assertEquals(Math.PI, k2.flaeche());
		assertEquals(2 * Math.PI, k2.umfang());
	}

	@Test
	void testKreisSkalieren() {
		k2.multiply(1.5);
		assertEquals(3.0, k2.radius());
		k2.resize();
		assertEquals(1.0, k2.radius());
		k1.moveTo(p2);
		assertEquals(-2.0, k1.mittelpunkt().x());
	}

	@Test
	void testKreisVerschieben() {
		// fail("Not yet implemented");
	}

	@Test
	void testQuadratInit() {
		// fail("Not yet implemented");
	}

	@Test
	void testQuadratFlaecheUmfang() {
		// fail("Not yet implemented");
	}

	@Test
	void testQuadratSkalieren() {
		// fail("Not yet implemented");
	}


}
*/
