package Prog2Wiederholung.AB7.Aufgabe4;

public class SchlangeTest {
    public static void main(String[] args) {
        Schlange<Integer> s = new SchlangeAlsRingPuffer<>(3);
        s.enqueue(10);
        s.enqueue(20);
        s.enqueue(30);
        System.out.println(s.front()); // 10
        s.dequeue();
        System.out.println(s.front()); // 20
        s.dequeue();
        System.out.println(s.front()); // 30

    }
}
