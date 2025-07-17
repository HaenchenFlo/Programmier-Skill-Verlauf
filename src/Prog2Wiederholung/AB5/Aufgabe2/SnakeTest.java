package Prog2Wiederholung.AB5.Aufgabe2;

public class SnakeTest {
    public static void main(String[] args) {
        Integer[][] a = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        SnakeIterator2DArray<Integer> iterator = new SnakeIterator2DArray<>(a);

        while(iterator.hasNext()) {
            System.out.print(iterator.next() + ",");
        }
    }
}
