package com.geekykel;

public class MinFindingStrategy implements FindingStrategy {

    public int getResult(int[] numbers) {
        // write your code here
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}