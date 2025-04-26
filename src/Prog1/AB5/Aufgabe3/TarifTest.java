package Prog1.AB5.Aufgabe3;

public class TarifTest {
    public static void main(String[] args) {
        Tarif basis = new Tarif(5, 0.80);
        Tarif premium = new Tarif(20, 1.50);

        System.out.println(basis.rechnung(15));    // 20.50 Euro
        System.out.println(premium.rechnung(15));  // 12.50 Euro
    }
}
