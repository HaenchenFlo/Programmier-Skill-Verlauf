package ProgWiederholung.Prog1.AB7.Aufgabe3;

import java.util.Random;

public class Spieler {
	
	private static Random r = new Random();
	private String name;
	
	public Spieler(String name) {
		this.name = name;
	}
	
	public String name() {
		return name;
	}
	
	public String toString() {
		return name;
	}
	
	public int spielen() {
		return r.nextInt(100);
	}

}
