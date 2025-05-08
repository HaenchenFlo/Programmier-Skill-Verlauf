package Prog1.AB6.Aufgabe3;

import Prog1.AB5.Aufgabe4.Wuerfel;

public class Jagd {
    private int mauseloch;
    private int jerryFelder;
    private int tomFelder = 0;

    public Jagd(int mauseloch, int vorsprung) {
        this.mauseloch = mauseloch;
        this.jerryFelder = vorsprung;
    }

    private void ausgabe() {
        System.out.println("Tom: " + tomFelder + "    " + "Jerry: " + jerryFelder);
    }

    public void los() {
        ausgabe();
        Wuerfel wuerfel = new Wuerfel();
        while(jerryFelder < mauseloch && tomFelder < jerryFelder) {
            int wuerfeln = wuerfel.wuerfeln();
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
            ausgabe();
            if(jerryFelder >= mauseloch) {
                System.out.println("gerettet!");
                return;
            }

            if(tomFelder >= jerryFelder) {
                System.out.println("gefangen!");
                return;
            }
        }
    }
}
