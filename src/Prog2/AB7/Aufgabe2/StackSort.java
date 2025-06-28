package Prog2.AB7.Aufgabe2;

import Prog2.AB7.Aufgabe1.Stapel;
import Prog2.AB7.Aufgabe1.StapelAlsDynArray;
import Prog2.AB7.Aufgabe1.StapelAlsEVL;

import java.util.Arrays;

public class StackSort {

    public static void stackSort(int[] arr) {

        Stapel<Integer> up = new StapelAlsDynArray<>();
        Stapel<Integer> down = new StapelAlsEVL<>();

        for (int zahl : arr) {
            if (up.isEmpty() && down.isEmpty()) {
                up.push(zahl);
            } else if (zahl < up.top()) {
                while (!up.isEmpty() && zahl < up.top()) {
                    down.push(up.pop());
                }
                up.push(zahl);
            } else if (down.isEmpty() || zahl > down.top()) {
                while (!down.isEmpty() && zahl > down.top()) {
                    up.push(down.top());
                    down.pop();
                }
                down.push(zahl);
            } else {
                up.push(zahl);
            }
        }
        while (!up.isEmpty()) {
            down.push(up.top());
            up.pop();
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = down.top();
            down.pop();
        }
    }


    public static void main(String[] args) {
        int[] arr = {3, 9, 4, 2, 5};
        System.out.println("Vorher:  " + Arrays.toString(arr));
        stackSort(arr);
        System.out.println("Nachher: " + Arrays.toString(arr));
    }
}
