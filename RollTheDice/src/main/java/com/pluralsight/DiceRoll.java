package com.pluralsight;

public class DiceRoll {

    public static void main(String[] args) {


        Dice dice = new Dice();

        int roll1;

        int roll2;

        int twoCounter = 0;

        int fourCounter = 0;

        int sixCounter = 0;

        int sevenCounter = 0;

        for (int i = 0; i <= 100; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();

            int sum = roll1 + roll2;

            
            if (roll1 + roll2 == 2) {
                twoCounter++;
            } else if (roll1 + roll2 == 4) {
                fourCounter++;
            } else if (roll1 + roll2 == 6) {
                sixCounter++;
            } else if (roll1 + roll2 == 7) {
                sevenCounter++;
            }

            System.out.println("Roll " + i + ": " + roll1 + " " + "-" + " " + roll2 + " " + "Sum: " + sum);
        }
    }
}
