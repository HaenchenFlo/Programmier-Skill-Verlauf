package Prog1.AB6.Aufgabe3;

public class JagdTest {
    public static void main(String[] args) {
        // Test 1: Standardspiel mit normalen Werten
        System.out.println("===== TEST 1: Normales Spiel =====");
        Jagd spiel1 = new Jagd(20, 5);
        spiel1.los();

        // Test 2: Jerry ist fast im Mauseloch
        System.out.println("\n===== TEST 2: Jerry knapp vor Mauseloch =====");
        Jagd spiel2 = new Jagd(10, 9);
        spiel2.los();

        // Test 3: Jerry beginnt direkt vor Tom
        System.out.println("\n===== TEST 3: Jerry startet vor Tom =====");
        Jagd spiel3 = new Jagd(10, 1);
        spiel3.los();

        // Test 4: Extrem großer Vorsprung für Jerry
        System.out.println("\n===== TEST 4: Großer Vorsprung für Jerry =====");
        Jagd spiel4 = new Jagd(20, 15);
        spiel4.los();
    }
}
