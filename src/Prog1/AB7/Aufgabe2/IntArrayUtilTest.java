package Prog1.AB7.Aufgabe2;

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


    }
}
