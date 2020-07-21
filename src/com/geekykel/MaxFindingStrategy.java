package com.geekykel;

public class MaxFindingStrategy implements FindingStrategy {

    public int getResult(int[] numbers) {
        // write your code here
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}
