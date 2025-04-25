package Prog1.AB2.Aufgabe2;

public class Person {

	// Instanzattribute
	
	public String name;
	
	int gebJahr;	

	// Instanzmethoden
	
	// berechnet das Alter der Person im Jahr x
	int alter(int x) {
		int a; 
		a = x-gebJahr;
		return a;
	}

	public String getName() {
		return name;
	}
	
	// ändert den Namen der Person
	void setName(String neuerName) {
		name = neuerName;
	}

	public String gruss() {
		return "Hallo, " + name;
	}
}
