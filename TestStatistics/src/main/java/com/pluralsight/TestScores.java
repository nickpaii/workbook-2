package com.pluralsight;

import java.util.Arrays;

public class TestScores {

    public static void main(String[] args) {


        int[] array = {97, 62, 66, 78, 70, 82, 21, 99, 54, 83};
        Arrays.sort(array);

        int sum = 0;

        int highest = array[0];
        int lowest = array[0];

        // Median formula: M = (n + 1) / 2


        // Loop for sum
        for (int i : array) {
            sum = sum + i;
        }

        // loop for highest and lowest nums
        for (int i = 0; i < array.length; i++) {



            if (array[i] > highest) {
                highest = array[i];
            }
            if (array[i] < lowest) {
                lowest = array[i];

            }

        }


        // Print answers
        int average = sum / array.length;
        System.out.println(average);

        System.out.println("highest score: " + highest);
        System.out.println("lowest score: " + lowest);
    }

}
