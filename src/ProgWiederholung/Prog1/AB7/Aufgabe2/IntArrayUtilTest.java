package ProgWiederholung.Prog1.AB7.Aufgabe2;

public class IntArrayUtilTest {
    public static void main(String[] args) {
        //Arrays
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        int [] array2 = {1,2,3,4,5,6,7,8,9,10};
        int [] array3 = {1,2,3,4,5,6};
        int [] arrayShuffle = {1,2,3,4,5,6};

        System.out.println("toString Test");
        System.out.println(IntArrayUtil.toString(array));
        System.out.println(IntArrayUtil.toString(array2));
        System.out.println(IntArrayUtil.toString(array3));

        System.out.println("\n------------------------------\n");

        System.out.println("Array Equals Test");
        System.out.println(IntArrayUtil.areEqual(array, array2));
        System.out.println(IntArrayUtil.areEqual(array, array3));

        System.out.println("\n------------------------------\n");

        System.out.println("shuffle Test");
        System.out.println("Vor dem Test:" + IntArrayUtil.toString(arrayShuffle));
        IntArrayUtil.shuffle(arrayShuffle);
        System.out.println("Vor dem Test:" + IntArrayUtil.toString(arrayShuffle));

        System.out.println("\n------------------------------\n");

        System.out.println("createSequence Test mit array 10 (0 bis n-1) und negatives/0 array");
        int[] arrayCreate = IntArrayUtil.createSequence(10);
        System.out.println(IntArrayUtil.toString(arrayCreate));
        int[] arrayNeg = IntArrayUtil.createSequence(-6);
        System.out.println(IntArrayUtil.toString(arrayNeg));

        System.out.println("\n------------------------------\n");

        System.out.println("Contains Test");
        System.out.println("Gibt es 5 in Array? : " + IntArrayUtil.contains(array,5));
        System.out.println("Gibt es 50 in Array? : " + IntArrayUtil.contains(array,50));

        System.out.println("\n------------------------------\n");

        System.out.println("Contains Multiples Test");
        int [] arrayMultiple = {1,1,3,4,5,6,7,8,9,10};
        System.out.println("Gibt 2. '1' im Array? : " + IntArrayUtil.containsMultiple(arrayMultiple));

        System.out.println("\n------------------------------\n");

        int [] arrayPos = {1,3,4,5,1,7,8,9,10};
        System.out.println("Pos Test");
        System.out.println("wo ist 7 im array?: " + IntArrayUtil.pos(arrayPos, 7));
        System.out.println("wo ist 11 (gibt es nicht) im array?: " + IntArrayUtil.pos(arrayPos, 11));

        System.out.println("\n------------------------------\n");

        System.out.println("Put Random Test");
        System.out.println("Array wird mit Zahlen zwischen 10 - 20 belegt: " + IntArrayUtil.toString(IntArrayUtil.putRandom(arrayPos, 10,20)));
        System.out.println("unveränderter Array:" + IntArrayUtil.toString(IntArrayUtil.putRandom(arrayPos, 20,10)));


        System.out.println("\n------------------------------\n");

        System.out.println("Create Random Test");
        System.out.println("Array mit zufälliger länge(0-10) und zufälligen Werten(0 - 100) wird erstellt:\n" + IntArrayUtil.toString(IntArrayUtil.createRandom(10)));

        System.out.println("\n------------------------------\n");

        System.out.println("Max Min Sum Test");
        int[] arrayMinMaxSum = {1,2,3,4,5};
        System.out.println("Array: " + IntArrayUtil.toString(arrayMinMaxSum));
        System.out.println("Max Test " + IntArrayUtil.max(arrayMinMaxSum));
        System.out.println("Min Test " + IntArrayUtil.min(arrayMinMaxSum));
        System.out.println("Sum Test " + IntArrayUtil.sum(arrayMinMaxSum));

        System.out.println("\n------------------------------\n");

        System.out.println("Is Sorted Test");
        System.out.println("Array: " + IntArrayUtil.toString(arrayMinMaxSum) + " " + IntArrayUtil.isSorted(arrayMinMaxSum));
        int[] isSortedf = {1,3,2,6,3};
        System.out.println("Array: " + IntArrayUtil.toString(isSortedf) + " " + IntArrayUtil.isSorted(isSortedf));

        System.out.println("\n------------------------------\n");

        System.out.println("Swap Test");
        System.out.println("Array: " + IntArrayUtil.toString(isSortedf));
        IntArrayUtil.swap(isSortedf, 1 , 2);
        System.out.println("Array nach Swap Indizes 1,2: " + IntArrayUtil.toString(isSortedf));

        System.out.println("\n------------------------------\n");

        int[] merge1 = {1,2,3,4,5};
        int[] merge2 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Array: " + IntArrayUtil.toString(merge1) + " Array2: " + IntArrayUtil.toString(merge2));
        System.out.println("Neuer Array: " + IntArrayUtil.toString(IntArrayUtil.merge(merge2,merge1)));
    }
}
