package Prog1.AB4.Aufgabe3;


public class Raum {
    //Statische Variablen
    public static int zaehler = 100; //Raumnummer vergabe startet ab 100
    public static int plaetzeInsgesamt = 0;
    public static int plaetzeBelegt = 0;
    public static int freieRaeume = 0;

    public static int getfreieRaeume() {
        return freieRaeume;
    }

    public static double getAuslastungsQuote() {
        return ((double) plaetzeBelegt / (double) plaetzeInsgesamt) * 100;
    }

    //Instanzvariablen

    public int raumNummer;
    public int anzahlPlaetze;
    public int belegtePlaetze;
    public Person isGebucht;

    //Konstruktor
    public Raum(int anzahlPlaetze) {
        zaehler++;
        plaetzeInsgesamt += anzahlPlaetze;
        freieRaeume++;
        this.raumNummer = zaehler;
        this.anzahlPlaetze = anzahlPlaetze;
        this.isGebucht = null;
    }

    public void buchen(int anzahlPersonen, Person P) {
        if(isGebucht != null) {
            System.out.println("Raum schon vergeben");
            return;
        }
        if(anzahlPersonen > this.anzahlPlaetze) {
            System.out.println("Raum bietet nicht genug Platz für " + anzahlPersonen + " Personen");
            return;
        }
        this.isGebucht = P;
        this.belegtePlaetze = anzahlPersonen;

        freieRaeume--;
        plaetzeBelegt += anzahlPersonen;
        System.out.println("Raum " + raumNummer + " erfolgreich an " + P.getName() + " vergeben.");
    }

    public void freigeben() {
        if(isGebucht == null) {
            System.out.println("Raum ist schon frei");
            return;
        }
        System.out.println("Raum wird freigegeben");
        this.isGebucht = null;
        freieRaeume++;
        plaetzeBelegt -= belegtePlaetze;
        belegtePlaetze = 0;
    }

}
