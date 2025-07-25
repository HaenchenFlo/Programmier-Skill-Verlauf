package Prog2Wiederholung.AB8.Aufgabe3;

import Prog2Wiederholung.AB3.Aufgabe3.Menge;
import Prog2Wiederholung.AB6.Aufgabe1.FolgeAlsDynArray;
import Prog2Wiederholung.AB6.Folge;
import Prog2Wiederholung.AB8.Aufgabe2.Stud;

public class StudUtil {
    public static Folge<Stud> sort(Menge<Stud> m) {
        Folge<Stud> sortiert = new FolgeAlsDynArray<>();

        while(!m.isEmpty()) {
            Stud current = m.get();
            m.delete(current);

            int pos = 0;
            while(pos < sortiert.size() && sortiert.get(pos).compareTo(current) < 0) {
                pos++;
            }
            sortiert.insert(pos, current);
        }

        return sortiert;
    }
}
