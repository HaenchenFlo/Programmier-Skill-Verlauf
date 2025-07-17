package Prog2Wiederholung.AB6.Aufgabe4;

import java.util.*;

public class RandomIterator<T> implements Iterator<T> {
    private final List<T> shuffledList;
    private int currentIndex = 0;


    public RandomIterator(List<T> original) {
        this.shuffledList = new ArrayList<>(original);
        Collections.shuffle(shuffledList, new Random());
    }

    @Override
    public boolean hasNext() {
        return currentIndex < shuffledList.size();
    }

    @Override
    public T next() {
        return shuffledList.get(currentIndex++);
    }
}
