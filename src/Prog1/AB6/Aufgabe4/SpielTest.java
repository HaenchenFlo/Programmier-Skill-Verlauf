package Prog1.AB6.Aufgabe4;

import java.util.Scanner;

public class SpielTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welches spiel willst du spielen? (1/2/3) :");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                simplesSpielTest();
                break;
            case 2:
                filzLausTest();
                break;
            case 3:
                sechserTest();
                break;
        }
        sc.close();
    }

    public static void simplesSpielTest() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Gib deinen Namen ein: ");
        String name = sc.nextLine();

        Spieler mensch = new Spieler(name);
        Spieler pc = new Spieler("Computer");

        Spiel.simplesSpiel(mensch, pc);

        sc.close();
    }

    public static void filzLausTest() {
        Scanner sc = new Scanner(System.in);

        // Spielername eingeben
        System.out.print("Bitte gib deinen Namen ein: ");
        String name = sc.nextLine();

        // Zwei Spieler erzeugen
        Spieler mensch = new Spieler(name);
        Spieler computer = new Spieler("Computer");

        // Spiel starten
        System.out.println("\n=== Spielstart: Filzlaus ===\n");
        Spiel.filzlaus(mensch, computer);

        // Punktestände anzeigen
        System.out.println("\n=== Endstand ===");
        System.out.println(mensch);
        System.out.println(computer);

        sc.close();
    }

    public static void sechserTest() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bitte gib deinen Namen ein: ");
        String name = sc.nextLine();

        // Zwei Spieler erzeugen
        Spieler mensch = new Spieler(name);
        Spieler computer = new Spieler("Computer");

        // Spiel starten
        System.out.println("\n=== Spielstart: Filzlaus ===\n");
        Spiel.sechser(mensch, computer);

        // Punktestände anzeigen
        System.out.println("\n=== Endstand ===");
        System.out.println(mensch);
        System.out.println(computer);

        sc.close();
    }
}
