package Prog1.AB2.Aufgabe2;

public class Person {

	// Instanzattribute
	
	String name;
	
	int gebJahr;	
	
	// Instanzmethoden
	
	// berechnet das Alter der Person im Jahr x
	int alter(int x) {
		int a; 
		a = x-gebJahr;
		return a;
	}
	
	// ändert den Namen der Person
	void setName(String neuerName) {
		name = neuerName;
	}

	public String gruss() {
		return "Hallo, " + name;
	}
}
