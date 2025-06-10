package Prog1.AB9.Aufgabe4;

public class MittelerdeTest2 {

	public static void main(String[] args) {
		Wesen[] gruppe = new Wesen[3];
		Hobbit frodo = new Hobbit("Frodo", 40);
		Hobbit bilbo = new Hobbit("Bilbo", 120);
		Magier gandalf = new Magier("Gandalf", 300);
		gruppe[0] = frodo;
		gruppe[1] = bilbo;
		gruppe[2] = gandalf;
		status(gruppe);
		frodo.wirdVerwundet(10);
		bilbo.wirdVerwundet(50);
		gandalf.heilt(frodo);
		gandalf.heilt(bilbo);
		status(gruppe);
	}
	
	public static void status(Wesen[] gruppe) {
		System.out.println("Status: ");
		for (int i = 0; i < gruppe.length; i++) {
			System.out.println(gruppe[i].toString());
		}
		System.out.println();
	}

}
