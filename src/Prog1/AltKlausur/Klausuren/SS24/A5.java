package Prog1.AltKlausur.Klausuren.SS24;

public class A5 {
    public static void checkDatum(int tag, int monat) throws DatumFormatException {
        if(tag < 1) {
            throw new DatumFormatException("Tag muss mindestens 1 sein");
        }
        if(tag > 31) {
            throw new DatumFormatException("Tag kann nicht größer als 31 sein");
        }
        if(monat < 1) {
            throw new DatumFormatException("Monat muss mindestens 1 sein");
        }
        if(monat > 12) {
            throw new DatumFormatException("Monat kann nicht größer als 31 sein");
        }
    }
}
