package Prog1.AltKlausur.Klausuren.SS24;

public class Person {
    private String name;
    private int gebJahr;
    private int gebTag;
    private int gebMonat;

    public Person(String name, int gebJahr) {
        this.name = name;
        this.gebJahr = gebJahr;
    }

    public Person(String name, int gebTag,int gebMonat,int gebJahr) {
        this(name,gebJahr);
        try {
            setGeburtstag(gebTag,gebMonat);
        } catch (DatumFormatException e) {
            System.out.println(e.getMessage());
            this.gebTag = 1;
            this. gebMonat = 1;
        }
    }

    public String name() {
        return name;
    }

    public int gebJahr() {
        return gebJahr;
    }

    public void setGeburtstag(int tag, int monat) throws DatumFormatException {
        A5.checkDatum(tag,monat);
        this.gebTag = tag;
        this.gebMonat = monat;
    }
}
