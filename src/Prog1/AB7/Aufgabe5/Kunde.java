package Prog1.AB7.Aufgabe5;

public class Kunde {
    private Artikel[] korb;
    private int anz;
    private String name;
    private int kundenNr;

    private static int neueNr = 1;

    public Kunde(String name) {
        this.kundenNr = neueNr++;
        this.name = name;
        this.korb = new Artikel[5];
        this.anz = 0;
    }

    public void inWarenkorbLegen(Artikel a) {
        if(anz >= korb.length) {
            Artikel[] neuerKorb = new Artikel[korb.length + 5];
            for(int i = 0; i < korb.length; i++) {
                neuerKorb[i] = korb[i];
            }
            korb = neuerKorb;
        }
        korb[anz++] = a;
    }

    public void zeigeWarenkorb() {
        System.out.println("Kunde #" + kundenNr + " Warenkorb:");
        for (int i = 0; i < anz; i++) {
            System.out.println("  " + korb[i]);
        }
    }

    public double kaufen() {
        double summe = 0.0;
        for(int i = 0; i < anz; i++) {
            summe += korb[i].getPreis();
        }
        korb = new Artikel[5];
        anz = 0;
        return summe;
    }
}
