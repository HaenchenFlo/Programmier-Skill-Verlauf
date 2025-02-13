package AB1.Aufgabe1;

public class AdditionTest {
    public static void main(String[] args) {
        int a, b, c;
        a = 10;
        b = 20;
        c = 0;
        System.out.println(Addition.add(a, b));
        System.out.println(Division.div(b, a)); //Sollte 2 sein
        System.out.println(Division.div(c, a)); //Sollte 0 sein
        System.out.println(Division.div(b, c)); //Sollte nicht gehen (Error wird)
    }
}
