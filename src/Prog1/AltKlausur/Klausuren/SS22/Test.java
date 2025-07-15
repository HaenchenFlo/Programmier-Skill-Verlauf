package Prog1.AltKlausur.Klausuren.SS22;

public class Test {
    private static MdB[] a = new MdB[10];


    public static void unify(MdB[] a) {
        for(int i = 0; i < a.length; i++) {
            int c = 1;
            for(int j = i + 1; j < a.length; j++) {
                if(a[i].name().equals(a[j].name()) && a[i].getNr() == 0) {
                    a[j].setNr(c++);
                }
            }
        }
    }

    public static void printA() {
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
