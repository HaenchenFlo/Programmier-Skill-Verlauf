package Prog1.AB7.Aufgabe3;

public class TestHighscore {
	
	// Wir erzeugen ein paar potenzielle SpielerInnen:
	private static Spieler a = new Spieler("Anna");
	private static Spieler b = new Spieler("Ben");
	private static Spieler c = new Spieler("Cem");
	private static Spieler d = new Spieler("Didi");
	private static Spieler e = new Spieler("Emil");
	private static Spieler f = new Spieler("Fritz");
	
	// Zwei Teilnehmerfelder:
	private static Spieler[] tn1 = {a, b, c, d, e, f};
	private static Spieler[] tn2 = {a, c, e};
	
	
	public static void main(String[] args) {
		// das Teilnehmerfeld 1 spielt 1 Runde:
		System.out.println("5 Spieler spielen 1 Runde");
		test(tn1, 1);
		System.out.println();
		// die Spieler aus Teilnehmerfeld 2 spielen noch weitere 5 Runden:
		System.out.println("3 Spieler machen noch 5 Runden weiter");
		test(tn2, 5);
	}
	
	public static void test(Spieler[] tn, int n) {
		Spiel s = new Spiel(tn);
		// n Runden spielen (mit Anzeige der Einzelergebnisse)
		s.spielen(n);
		// Der aktuelle Highscore:
		System.out.println("\nHighscore: " );
		Spiel.ausgabe();
	}
	

}
