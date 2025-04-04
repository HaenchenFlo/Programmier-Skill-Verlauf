package ProgWiederholung.Prog1.AB7.Aufgabe3;

public class Ergebnis {
	
	private Spieler s;
	private int punkte;
	
	public Ergebnis(Spieler s, int punkte) {
		this.s = s;
		this.punkte = punkte;
	}
	
	public Spieler spieler() {
		return s;
	}
	
	public int punkte() {
		return punkte;
	}
	
	public String toString() {
		return s.name() + ": \t" + punkte;
	}

}
