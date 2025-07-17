package Prog2Wiederholung.AB2.Aufgabe1;

public class Paar<E, Z> {
    private E erstes;
    private Z zweites;

    public Paar(E erstes, Z zweites) {
        this.erstes = erstes;
        this.zweites = zweites;
    }

    public E erstes() {
        return this.erstes;
    }

    public Z zweites() {
        return this.zweites;
    }

    public void setErstes(E e) {
        this.erstes = e;
    }

    public void setZweites(Z z) {
        this.zweites = z;
    }


    @Override
    public String toString() {
        return "(" + erstes + ", " + zweites + ")";
    }

    @Override
    public boolean equals(Object o) {
        if(!(this.getClass().equals(o.getClass()))) return false;

        Paar<?, ?> other =  (Paar<?, ?>) o;
        return (this.erstes == null ? other.erstes == null : this.erstes.equals(other.erstes)) &&
                (this.zweites == null ? other.zweites == null : this.zweites.equals(other.zweites));
    }
}
