package Prog1.AB11.Aufgabe2;


public class LottoTest {
    public static void main(String[] args) {
        LottoSpiel lotto = new LottoSpiel();

        // === Ziehung durchführen ===
        lotto.ziehen();

        // === Tipp festlegen (feste Zahlen) ===
        int[] meinTipp = {3, 11, 17, 25, 33, 45};
        lotto.tippFix(meinTipp);

        // === Bekanntgabe ===
        System.out.println("\n--- Bekannte Ziehung & fester Tipp ---");
        lotto.bekanntGeben();

        // === Auswertung ===
        int treffer = lotto.auswerten();
        System.out.println("Anzahl Richtige (Fix-Tipp): " + treffer);

        // === Tipp zufällig ===
        lotto.tippZufall();
        System.out.println("\n--- Bekannte Ziehung & zufälliger Tipp ---");
        lotto.bekanntGeben();

        int trefferZufall = lotto.auswerten();
        System.out.println("Anzahl Richtige (Zufalls-Tipp): " + trefferZufall);

        // === Tipp vom Benutzer einlesen ===
        // Wenn du das testen willst, einkommentieren:
        lotto.tippEinlesen();
        System.out.println("\n--- Bekannte Ziehung & eingegebener Tipp ---");
        lotto.bekanntGeben();

        int trefferEingabe = lotto.auswerten();
        System.out.println("Anzahl Richtige (Eingabe-Tipp): " + trefferEingabe);
    }
}


