package Prog2Wiederholung.AB7.Aufgabe5;

public class TemperaturSensor {
    private final int KAPAZITAET = 24;
    private final float[] werte = new float[KAPAZITAET];
    private int tail = 0;
    private int size = 0;

    public void neueMessung(float wert) {
        werte[tail] = wert;
        tail = (tail + 1) % KAPAZITAET;

        if(size < KAPAZITAET) {
            size++;
        }
    }

    public float aktuelleTemperatur() {
        if(size == 0) {
            return Float.NaN;
        }
        int letzterIndex = (tail - 1 + KAPAZITAET) % KAPAZITAET;
        return werte[letzterIndex];
    }

    public float durchschnittsTemperatur() {
        if(size == 0) {
            return Float.NaN;
        }
        float summe = 0;
        for(int i = 0; i < size; i++) {
            int index = (tail - size + i + KAPAZITAET) % KAPAZITAET;
            summe += werte[index];
        }

        return summe;
    }

    public void reset() {
        tail = 0;
        size = 0;
        for(int i = 0; i < KAPAZITAET; i++) {
            werte[i] = 0.0f;
        }
    }
}
