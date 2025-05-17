package Prog1.AB7.Aufgabe2;

public class Punkt {
	
	// Instanzattribute
	private double x;
	private double y;
	
	// Konstruktoren
	public Punkt() {
		this.x = 0.0;
		this.y = 0.0;
	}
	
	public Punkt(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Punkt(Punkt p) {
		this.x = p.x; // oder: ... = p.x();
		this.y = p.y;
	}
	
	// Instanzmethoden
	public double x() {
		return this.x;
	}
	
	public double y() {
		return this.y;
	}

	public void verschiebeUm(double dx, double dy) {
		this.x = this.x + dx;
		this.y = this.y + dy;		
	}

	public void moveTo(double x, double y) {
		this.x = x;
		this.y = y;
	}


	public String toString() {
		return "x : " + this.x + ", y : " + this.y;
 	}
}
