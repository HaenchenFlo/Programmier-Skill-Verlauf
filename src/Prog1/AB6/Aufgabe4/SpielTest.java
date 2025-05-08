package Prog1.AB6.Aufgabe4;

import java.util.Scanner;

public class SpielTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Gib deinen Namen ein: ");
        String name = sc.nextLine();

        Spieler mensch = new Spieler(name);
        Spieler pc = new Spieler("Computer");

        Spiel.simplesSpiel(mensch, pc);

        sc.close();
    }
}
