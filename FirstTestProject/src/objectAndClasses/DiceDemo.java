package objectAndClasses;

public class DiceDemo {
    public static void main(String[] args) {
        Dice d = new Dice(5);
        Dice sides6 = Dice.generateWithSides(6);
        Dice s = new Dice();
        s.generateWithSides2(6);


        System.out.println(d.getSides());
        d.setSides(6);
        System.out.println(d.getSides());


        Dice d1 = new Dice();
        System.out.println(d1.getSides());
        d1.setSides(70);
        System.out.println(d1.getSides());
    }
}
