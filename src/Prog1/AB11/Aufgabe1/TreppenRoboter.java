package Prog1.AB11.Aufgabe1;

import Prog1.AB7.Aufgabe2.Punkt;

public class TreppenRoboter extends Roboter implements TreppenTurtle {

    private int direction;

    public TreppenRoboter() {
        super();
        direction = 0;
        moveTo(position());
    }

    @Override
    public void treppe(int n) {

        setDirection(0);

        for(int i = 1; i <= n; i++) {
            turnR();
            step(i);
            turnL();
            step(i);
        }
        turnR();
        step(n + 1);
    }

    @Override
    public void step() {

        int x = (int) position().x();
        int y = (int) position().y();

        switch (direction) {
            case 0: y += 1; break;
            case 1: x += 1; break;
            case 2: y -= 1; break;
            case 3: x -= 1; break;
        }
        Punkt neu = new Punkt(x,y);
        moveTo(neu);
    }

    @Override
    public void step(int n) {
        for(int i = 0; i < n; i++) {
            step();
        }
    }

    @Override
    public void turnL() {
        direction = (direction() + 3) % 4;
    }

    @Override
    public void turnR() {
        direction = (direction() + 1) % 4;
    }

    @Override
    public void setDirection(int r) {
        this.direction = r;
    }

    @Override
    public int direction() {
        return this.direction;
    }

}
