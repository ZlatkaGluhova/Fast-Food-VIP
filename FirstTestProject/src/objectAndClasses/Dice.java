package objectAndClasses;

public class Dice {
    private int sides;


    public Dice() {
    }

    public Dice(int i) {
    }

    public int getSides() {
        return this.sides;
    }

    public void setSides(int newSides) {
        this.sides = newSides;
    }

    public int roll() {


return 0;
    }

    public static Dice generateWithSides(int s) {
        Dice d = new Dice();
        d.setSides(s);

        return d;
    }
    public Dice generateWithSides2(int s) {
        Dice d = new Dice();
        d.setSides(s);

        return d;
    }
}






