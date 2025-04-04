package ProgWiederholung.Prog1.AB6.Aufgabe1;
import ProgWiederholung.Prog1.AB5.Aufgabe2.Wuerfel;

public class Jagd {
    private int mauseloch; //Ende vom Spielfeld
    private int jerryFelder;
    private int tomFelder = 0;

    public Jagd(int mauseloch, int vorsprung) {
        this.mauseloch = mauseloch;
        this.jerryFelder = vorsprung;
    }

    private void anzeige() {
        System.out.print("Tom : " + tomFelder + "     ");
        System.out.println("Jerry: " + jerryFelder);

    }

    public void los() {
        Wuerfel w = new Wuerfel();
        anzeige();
        while (jerryFelder < mauseloch && tomFelder < jerryFelder) {
            int wuerfeln = w.wuerfeln();
            switch (wuerfeln) {
                case 1:
                    jerryFelder++;
                    break;
                case 2:
                    jerryFelder += 2;
                    break;
                case 3:
                    tomFelder += 3;
                    break;
                case 4:
                    jerryFelder += 4;
                    break;
                case 5:
                    jerryFelder -= 5;
                    if(jerryFelder < 0) {
                        jerryFelder = 0;
                    }
                    break;
                case 6:
                    tomFelder += 6;
                    break;
            }
            anzeige();
            if (jerryFelder >= mauseloch) {
                System.out.println("gerettet!");
                return;
            }
            if (tomFelder >= jerryFelder) {
                System.out.println("gefangen!");
                return;
            }
        }
    }
}
