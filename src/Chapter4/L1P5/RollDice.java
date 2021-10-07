package Chapter4.L1P5;

import java.util.Random;

class RollDice {
    private static final int MAX_NUMBER = 6;
    private static final int MIN_NUMBER = 1;
    private final Random random;
    private int number;

    //Constructor
    public RollDice() {
        random = new Random();
    }

    public static void main(String[] args) {
        RollDice rollDice = new RollDice();
        rollDice.roll();
        System.out.println("After 1st Roll: " + rollDice.getNumber());
        rollDice.roll();
        System.out.println("After 2nd Roll: " + rollDice.getNumber());
        rollDice.roll();
        System.out.println("After third Roll: " + rollDice.getNumber());
    }

    //Rolls the die
    public void roll() {
        number = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
    }

    //Returns the number on this die
    public int getNumber() {
        return number;
    }
}