package Prog1.AltKlausur.Klausuren.SS23;

import java.util.NoSuchElementException;

public interface MengeMitOps extends Menge {
    void merge(Menge m);
    MengeMitOps intersect(Menge m);
}
