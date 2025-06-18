package Prog1.AB11.Aufgabe1;

public interface Turtle extends Beweglich {
    void step();
    void step(int n);
    void turnL();
    void turnR();
    void setDirection(int r);
    int direction();
}
