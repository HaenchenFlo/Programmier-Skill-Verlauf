package ProgWiederholung.Prog1.AB10.Aufgabe1_2;

public class Nutzer extends Person {
    private int id;
    private Medium[] ausleihListe = new Medium[10];
    private int anzahlAusgeliehen = 0;

    private static int neueNr = 0;

    public Nutzer(String name, int gebJahr) {
        super(name, gebJahr);
        this.id = neueNr++;
    }

    public Medium[] ausleihListe() {
        Medium[] liste = new Medium[anzahlAusgeliehen];
        for(int i = 0; i < anzahlAusgeliehen; i++) {
            liste[i] = ausleihListe[i];
        }

        return liste;
    }

    public void zurueckgeben() {
        for(int i = 0; i < anzahlAusgeliehen; i++) {
            ausleihListe[i].zurueckgeben();
            ausleihListe[i] = null;
        }
        anzahlAusgeliehen = 0;
    }

    public boolean ausleihen(Medium m) throws BibException {
        if(m.istAusgeliehen()) {
            throw new BibException("Ist bereits ausgeliehen");
        }

        if(anzahlAusgeliehen >= 10) {
            throw new BibException("Du kannst nicht mehr als 10 Sachen ausleihen");
        }

        if(m instanceof DVD) {
            DVD dvd = (DVD) m;
            if(dvd.getFSK() > getAlter()) {
                throw new BibException("Zu Jung für den Film");
            }
        }

        m.ausleihen(this);
        ausleihListe[anzahlAusgeliehen++] = m;
        return true;
    }

    public void listeAusdrucken() {
        for(int i = 0; i < anzahlAusgeliehen; i++) {
            System.out.println("- " + ausleihListe[i]);
        }
    }
}
