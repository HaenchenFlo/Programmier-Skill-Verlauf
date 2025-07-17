package Prog2Wiederholung.AB5.Aufgabe2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SnakeIterator2DArray<T> implements Iterator<T> {
    private boolean gerade;
    private T[][] array;
    int row;
    int col;

    public SnakeIterator2DArray(T[][] array) {
        this.array = array;
        gerade = true;
        row = 0;
        col = 0;
    }

    @Override
    public boolean hasNext() {
        return row < array.length;
    }

    @Override
    public T next() {
        if(!hasNext()) throw new NoSuchElementException("Keine weiteren Elemente");

        T value = array[row][col];

        if(gerade) {
            col++;
            if(col >= array[row].length) {
                row++;
                if(row < array.length) {
                    gerade = (row % 2 == 0);
                    col = gerade ? 0 : array[row].length - 1;
                }
            }
        } else {
            col--;
            if(col < 0) {
                row++;
                if(row < array.length) {
                    gerade = (row % 2 == 0);
                    col = gerade ? 0 : array[row].length - 1;
                }
            }
        }
        return value;
    }
}
