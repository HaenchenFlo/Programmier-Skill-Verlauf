package Prog2.AB9.Aufgabe3_5;

import Prog2.AB3.Aufgabe3.Menge;
import Prog2.AB3.Aufgabe3.MengeDynArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MengeUtilTest {

    private Menge<Integer> intMenge;

    @BeforeEach
    void setUp() {
        intMenge = new MengeDynArray<>();
        intMenge.insert(5);
        intMenge.insert(2);
        intMenge.insert(8);
        intMenge.insert(1);
        intMenge.insert(3);
    }

    @Test
    void testMin() {
        Integer min = MengeUtil.min(intMenge);
        assertEquals(1, min);
    }

    @Test
    void testMinThrowsExceptionForEmptyMenge() {
        Menge<Integer> empty = new MengeDynArray<>();
        assertThrows(IllegalArgumentException.class, () -> MengeUtil.min(empty));
    }

    @Test
    void testMergeSort() {
        Integer[] array = {5, 2, 8, 1, 3};
        Integer[] sorted = MengeUtil.mergeSort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 5, 8}, sorted);
    }

    @Test
    void testMergeSortAlreadySorted() {
        Integer[] array = {1, 2, 3, 4, 5};
        Integer[] sorted = MengeUtil.mergeSort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, sorted);
    }

    @Test
    void testQuickSort() {
        Integer[] array = {5, 2, 8, 1, 3};
        MengeUtil.quicksort(array, 0, array.length - 1);
        assertArrayEquals(new Integer[]{1, 2, 3, 5, 8}, array);
    }

    @Test
    void testQuickSortSingleElement() {
        Integer[] array = {1};
        MengeUtil.quicksort(array, 0, 0);
        assertArrayEquals(new Integer[]{1}, array);
    }

    @Test
    void testQuickSortAlreadySorted() {
        Integer[] array = {1, 2, 3, 4, 5};
        MengeUtil.quicksort(array, 0, array.length - 1);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array);
    }
}
