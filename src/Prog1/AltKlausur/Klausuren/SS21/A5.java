package Prog1.AltKlausur.Klausuren.SS21;

public class A5 {
    public static String createWorte(char[] a, int[] b) {
        String erg = "";
        for(int i = 0; i < b.length; i++) {
            int index = b[i];
            if(index > a.length || index < 0) {
                throw new ArrayIndexOutOfBoundsException("Index zu lang");
            }
            erg += a[index];
        }
        return erg;
    }

    public static void createWorteTesten() {
        try {
            char[] a = {'F','H'};
            int[] b = {1,2,-3,5};
            createWorte(a,b);

        } catch (Exception e) { // ArrayIndexOutOfBoundsException
            System.out.print(e.getMessage());
        }
    }
}
